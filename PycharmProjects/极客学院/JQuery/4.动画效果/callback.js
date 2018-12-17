$(document).ready(function () {
    $('button').click(function () {
        /*$('p').hide(1000, function () {
            alert('hello');
        });*/
        $('p').css('color', 'red').slideUp(1000).slideDown(1000);
    });
});