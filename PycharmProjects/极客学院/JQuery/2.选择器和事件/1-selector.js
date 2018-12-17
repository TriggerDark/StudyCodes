$(document).ready(function () {
    $('button').click(function () {
        $('p').text('p元素被修改了');
        $('.pClass').text('pClass');
        $('#pID').text('PID');
        $('[href]').text('百度链接');
    })
});

/**
 *  层次选择器
 *      $('div li')后代选择器
 *      $('div > li')直接后代选择器
 *      $('.menuitem + div')相邻兄弟选择器
 *      $('.menuitem ~ div')
 *
 *  $(this)当前元素
 *  $("*")
 *  $('ul li:first')第一个ul元素下第一个li元素
 *  $('ul li:first-child')选取每一个ul元素的第一个li元素
 *
 *  $()
 */