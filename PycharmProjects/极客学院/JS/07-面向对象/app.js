/*var person = {
    name: "iwen",
    age: 30,
    eat: function () {
        alert("能吃！")
    }
};
alert(person.name);*/
function Person() {

}
Person.prototype = {
    name: "iwen",
    age: 30,
    eat: function () {
        alert("能吃！！")
    }
};
var p = new Person();
p.eat();
