from django.contrib import admin
from .models import *


class BookInfoDisplay(admin.ModelAdmin):
    # 定义字段，按顺序输出
    list_display = ['id', 'btitle', 'bpub_date']
    # 过滤
    list_filter = ['btitle']
    # 搜索
    search_fields = ['btitle']
    # 分页
    list_per_page = 1
    # 属性分组
    fieldsets = [
        ('base', {'fields': ['btitle']}),
        ('super', {'fields': ['bpub_date']})
    ]


admin.site.register(BookInfo, BookInfoDisplay)
admin.site.register(HeroInfo)