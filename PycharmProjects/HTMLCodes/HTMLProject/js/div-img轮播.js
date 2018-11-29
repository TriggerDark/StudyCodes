var index = 0
function changeImg () {
    var curIndex = index%6 + 1;
    var img = document.getElementById("div-img")
    img.src = "imgs/picture"+ curIndex +".jpg";
    index ++;
}

function init (argument) {
    setInterval("changeImg();", 2000);
}