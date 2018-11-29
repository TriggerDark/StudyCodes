from distutils.core import setup

setup(name="TestMsg", version="1.0", description="test", author="lidada", py_modules=["TestMsg.recvmsg","TestMsg.sendmsg"])
"""

py_modules---->当前要引入的包下的模块，例如TestMsg.recvmsg

Metadata-Version:版本号
Name：
Version：
Summary：
Home-page:
Author
Author-email
license
Description
Platform

"""
"""

发布模块
python setup.py build  --->构建目录结构
python setup.py sdist  --->打包后，最后生成发布的压缩包
python setup.py install -->安装

"""