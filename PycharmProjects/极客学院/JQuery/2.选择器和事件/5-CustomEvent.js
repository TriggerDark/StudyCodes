var clickBtn;
$(document).ready(function () {
    clickBtn = $('#myBtn');
    clickBtn.click(function () {
        var e = jQuery.Event("myEvent");
        clickBtn.trigger(e);
    });

    clickBtn.bind("myEvent", function (event) {
       console.log(event);
    });

});