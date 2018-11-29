from django.db import models
from django.urls import reverse
import uuid
from datetime import date
from django.contrib.auth.models import User


class Genre(models.Model):
    # 书的类型
    name = models.CharField(
        max_length=200,
        help_text="Enter a book genre"
    )

    def __str__(self):
        return self.name


class Language(models.Model):
    # 书的语言
    name = models.CharField(
        max_length=200,
        help_text="Enter this book's natural language"
    )

    def __str__(self):
        return self.name


class Book(models.Model):
    title = models.CharField(max_length=20)
    # 书的作者，作者可以有多本书，一对多关系，用foreignKey()
    author = models.ForeignKey(
        'Author',
        on_delete=models.SET_NULL,
        null=True
    )
    # 书的描述
    summary = models.TextField(
        max_length=1000,
        help_text='Enter a brief description of the book'
    )
    isbn = models.CharField('ISBN', max_length=13, help_text='13 Character <a href="https://www.isbn-international.org/content/what-isbn">ISBN number</a>')
    # 类型，多对多关系
    genre = models.ManyToManyField(
        Genre,
        help_text="Select a genre for this book"
    )
    # 语言，一对多关系
    language = models.ForeignKey(
        'Language',
        on_delete=models.SET_NULL,
        null=True
    )

    def display_genre(self):
        return ', '.join([genre.name for genre in self.genre.all()[:3]])

    def __str__(self):
        return self.title

    def get_absolute_url(self):
        return reverse('book-detail', args=[str(self.id)])


class BookInstance(models.Model):
    id = models.UUIDField(
        primary_key=True,
        default=uuid.uuid4,
        help_text='Unique ID for this particular book across whole library'
    )
    book = models.ForeignKey(
        'Book',
        on_delete=models.SET_NULL,
        null=True
    )
    imprint = models.CharField(max_length=200)
    due_back = models.DateField(null=True, blank=True)
    borrower = models.ForeignKey(
        User,
        on_delete=models.SET_NULL,
        null=True
    )

    @property
    def is_overdue(self):
        if self.due_back and date.today() > self.due_back:
            return True
        return False

    LOAN_STATUS = (
        ('m', 'Maintenance'),  # 维修
        ('o', 'On loan'),  # 借出
        ('a', 'Available'),  # 可获得
        ('r', 'Reverse'),  #
    )
    status = models.CharField(
        max_length=1,
        choices=LOAN_STATUS,
        blank=True,
        default='m',
        help_text='Book availability'
    )

    class Meta:  # 默认排序
        ordering = ['due_back']
        permissions = (('can_mark_returned', 'set book as returned'),)

    def __str__(self):
        return "%s (%s)" % (self.id, self.book.title)


class Author(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    date_of_birth = models.DateField(null=True, blank=True, max_length=10)
    date_of_death = models.CharField('Died', null=True, blank=True, max_length=10)

    class Meta:
        ordering = ['first_name', 'last_name']

    def get_absolute_url(self):
        return reverse('author-detail', args=[str(self.id)])

    def __str__(self):
        return '%s %s' % (self.first_name, self.last_name)