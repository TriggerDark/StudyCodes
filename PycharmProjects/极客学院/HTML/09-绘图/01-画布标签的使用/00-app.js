var CANVAS_WIDTH = 500, CANVAS_HEIGHT = 500;
var mycanvas, context;

window.onload = function(){
	createCanvas();
//	drawRect();
	drawImage()
}

function createCanvas(){
	document.body.innerHTML = "<canvas id=\'mycanvas\' width=\'" + CANVAS_WIDTH + 
		"\' height=\'"+CANVAS_HEIGHT + "\'>你的浏览器不支持</canvas>";
	mycanvas = document.getElementById("mycanvas");
	context = mycanvas.getContext("2d");
}
function drawRect(){
	context.fillStyle="#FF0000";
//	context.rotate(45)//旋转
//	context.translate(200, 200)//移动
	context.scale(2, 0.5);//scale(x, y)
	context.fillRect(0, 0, 200, 200);
}
function drawImage(){
	var img = new Image()
	img.onload = function(){
		context.drawImage(img, 0, 0);
	}
	img.src = "../../imgs/cellphone.jpg";
}
