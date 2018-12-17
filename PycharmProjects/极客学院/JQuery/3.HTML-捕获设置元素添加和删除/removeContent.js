/**
 * remove
 * empty
 */

$(document).ready(function () {
    $('#btn').click(function () {
        $('div').remove();//全部删除
        //$('div').empty();//删除div下的子元素
    });
});