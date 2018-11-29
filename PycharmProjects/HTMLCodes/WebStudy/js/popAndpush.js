//push()接收任意类型参数，把他们逐个添加到数组的末尾，返回修改后的数组长度
//pop()数组末尾移除最后一项，同时减少数组长度，返回移出项的内容
var arr = ["Lily", "Lucy", "Tom"];
var len = arr.push("Iack", "Sean");//5
var item = arr.pop();//Sean