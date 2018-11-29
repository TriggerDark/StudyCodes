var sum = 0
var weight = 55;
var height = 1.7;
var BMI = weight / (height * height);
var week = 4;
var day = 1000;
var remainday = day % 7;
var nweek = week + remainday;
if(BMI >= 32){
    console.log('非常肥胖');
}else if(BMI >= 28){
    console.log('肥胖');
}else if (BMI >= 25) {
    console.log('过重');
}else if(BMI >= 18.5){
    console.log('正常');
}else if(BMI < 18.5){
    console.log('过轻');
}
for(var i = 0; i <= 100; i++){
    sum += i;
}
console.log(sum);

if(nweek % 7 == 1){
    console.log('1000天后星期一')
}else if(nweek % 7 == 2){
    console.log('1000天后星期二')
}else if(nweek % 7 == 3){
    console.log('1000天后星期三')
}else if(nweek % 7 == 4){
    console.log('1000天后星期四')
}else if(nweek % 7 == 5){
    console.log('1000天后星期五')
}else if(nweek % 7 == 6){
    console.log('1000天后星期六')
}else if(nweek % 7 == 7){
    console.log('1000天后星期日')
}