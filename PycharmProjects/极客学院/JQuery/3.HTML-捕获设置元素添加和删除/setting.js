$(document).ready(function () {
   $('#btn1').click(function () {
       $('#p1').text('p1');
   });
   $('#btn2').click(function () {
       $('#p2').html("<a href='http://www.baidu.com/'>百度</a>");
   });
   $('#btn3').click(function () {
       $('#i3').val('百度');
   });
   $('#btn4').click(function () {
       $('#aid').attr({
           'href': 'http://www.google.com/',
           'title': 'hello'
       });
   });
   $('#btn5').click(function () {
       $('#p5').text(function (i, ot) {
           return 'old: ' + ot + ' new: ' + i;
       });
   });
});