from django.urls import path
from . import views

# 创建索引页
urlpatterns = [
    path('', views.index, name='index'),
]