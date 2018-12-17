$(document).ready(function () {
   $('#btn1').click(function () {
       //alert('text：' + $('#text').text());
       //alert("text:" + $("#text").html());
       alert("text:" + $('#it').val());
   });
   $('#btn2').click(function () {
       alert("text: " + $('#aid').attr("href"));
   });
});