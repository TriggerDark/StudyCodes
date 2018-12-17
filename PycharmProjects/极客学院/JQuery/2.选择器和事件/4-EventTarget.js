$(document).ready(function () {
    $('body').bind('click', bodyHandler);
    $('div').bind('click', divHandler);
});
function bodyHandler(e) {
    console.log(e);
}
function divHandler(e) {
    console.log(e);
    //e.stopPropagation();
    e.stopImmediatePropagation();
}