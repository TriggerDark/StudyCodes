from django.shortcuts import render
from .models import *
from django.views import generic


def index(request):
    # objects.all()获取记录计数
    num_books = Book.objects.all().count()
    num_instances = BookInstance.objects.all().count()
    num_instances_available = BookInstance.objects.filter(status='a')
    num_authors = Author.objects.all().count()

    # render()创建和返回HTML压面作为响应
    return render(
        request,
        'index1.html',
        context={
            'num_books': num_books,
            'num_instances': num_instances,
            'num_instances_available': num_instances_available,
            'num_authors': num_authors
        }
    )

class BookListView(generic.ListView):
    models = Book