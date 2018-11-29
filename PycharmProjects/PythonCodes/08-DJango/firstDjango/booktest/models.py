from django.db import models


class BookInfo(models.Model):
    btitle = models.CharField(max_length=20)
    bpub_date = models.DateTimeField()

    def __str__(self):
        return self.btitle

class HeroInfo(models.Model):
    #英雄名称 字符类型
    hname = models.CharField(max_length=10)

    #性别 布尔类型
    hgender = models.BooleanField()
    hcontent = models.CharField(max_length=1000)

    #设置外键
    #hbook = models.ForeignKey('BookInfo')
    hbook = models.ForeignKey('BookInfo', on_delete=models.SET_NULL, null=True)

    def __str__(self):
        return self.hname