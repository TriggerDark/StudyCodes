from django.contrib import admin
from .models import Author, Book, BookInstance, Genre, Language


@admin.register(Author)
class AuthorAdmin(admin.ModelAdmin):
    list_display = ['id', 'first_name', 'last_name', 'date_of_birth', 'date_of_death']
    fields = ['first_name', 'last_name', ('date_of_birth', 'date_of_death')]


class BooksInstanceInline(admin.TabularInline):
    model = BookInstance


@admin.register(Book)
class BookAdmin(admin.ModelAdmin):
    list_display = ['id', 'title', 'author', 'display_genre']
    # 关联记录
    inlines = [BooksInstanceInline]


@admin.register(BookInstance)
class BookInstanceAdmin(admin.ModelAdmin):
    list_filter = ['status', 'due_back']
    fieldsets = [
        (None, {'fields': ('book', 'imprint', 'id')}),
        ('Availability', {'fields': ('status', 'due_back')}),
    ]


@admin.register(Genre)
class GenreAdmin(admin.ModelAdmin):
    pass


@admin.register(Language)
class LanguageAdmin(admin.ModelAdmin):
    pass


# 注册模型
# admin.site.register(Author, AuthorAdmin)
# admin.site.register(Book)
# admin.site.register(BookInstance)
# admin.site.register(Genre)
# admin.site.register(Language)

