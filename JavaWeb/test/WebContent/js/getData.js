function getDepartment(info) {
    var ajax = setAjax();
    ajax.onreadystatechange = function () {
        var flag = (ajax.readyState==4) && (ajax.status==200);
        if (flag) {
            var  result = ajax.responseText;
            eval("var obj=" +result);
            var sel=document.getElementById("department");
            for(var i=0;i<obj.length;i++){
				sel.innerHTML=sel.innerHTML+"<option value="+obj[i].id+">"+obj[i].department+"</option>"
			}
            getEmployee()
        }
    };
    ajax.open("get", "DepartmentEmployee?info="+info, true);
    ajax.send(null);
}

function getEmployee(){
	var info=document.getElementById("department").value;
	var ajax = setAjax();
    ajax.onreadystatechange = function () {
        var flag = (ajax.readyState==4) && (ajax.status==200);
        if (flag) {
            var  result = ajax.responseText;
            eval("var obj=" +result);
            var sel=document.getElementById("employee");
            sel.options.length = 0;
            for(var i=0;i<obj.length;i++){
				sel.innerHTML=sel.innerHTML+"<option value="+obj[i].id+">"+obj[i].department+"</option>"
			}
        }
    };
    ajax.open("get", "DepartmentEmployee?info="+info, true);
    ajax.send(null);
}



function setAjax() {
	var ajax;
    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        ajax = new ActiveXObject("Microsoft.XMLHttp");
    }
    return ajax;
}
