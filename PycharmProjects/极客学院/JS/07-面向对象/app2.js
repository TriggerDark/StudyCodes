(function () {
    var n = "ime";
  function Person(name) {
      var _this = {};
      _this._name = name;
      _this.sayHello = function () {
          alert("hello" + _this._name + n);
      };
      return _this;
    }
    window.Person = Person;
}());

(function () {
    function Teacher(name) {
        var _this = Person(name);
        var superSay = _this.sayHello;
        _this.sayHello = function () {
            superSay.call(_this);
            alert("world" + _this._name);
        };
        return _this;
    }
    window.Teacher = Teacher;
}());
var t = Teacher("iwen");
t.sayHello();