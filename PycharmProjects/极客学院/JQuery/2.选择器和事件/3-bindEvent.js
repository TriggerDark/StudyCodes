$(document).ready(function () {
    /*$('#clickButton').bind('click', clickHandler1);
    $('#clickButton').bind('click', clickHandler2);
    $('#clickButton').unbind('click');*/
    $('#clickButton').on('click', clickHandler1);
    $('#clickButton').on('click', clickHandler2);
    $('#clickButton').off('click', clickHandler1);
});

function clickHandler1(e) {
    console.log('clickHandler1');
}
function clickHandler2(e) {
    console.log('clickHandler2');
}