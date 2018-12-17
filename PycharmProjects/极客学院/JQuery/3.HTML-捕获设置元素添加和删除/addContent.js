/**
 * append
 * prepend
 * before
 * after
 */

$(document).ready(function () {
   $('#btn1').click(function () {
       //$('#p1').append("this is my webpage add a content")
       $('#p1').prepend("this is my webpage add a content")
   });
   $('#btn2').click(function () {
       //$('#p2').before('hello');
       $('#p2').after('hello');
   });
   $('#btn3').click(function () {
       appendText();
   });
});

function appendText() {
    var text1 = '<p>iwen</p>';
    var text2 = $('<p></p>').text('ime');
    var text3 = document.createElement('p');
    text3.innerHTML = 'alice';
    $('body').append(text1, text2, text3);
}