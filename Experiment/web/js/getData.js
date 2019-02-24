function getData() {
    var ajax;
    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        ajax = new ActiveXObject("Microsoft.XMLHttp");
    }
    ajax.onreadystatechange = function () {
        if (ajax.readyState == 4) {
            if (ajax.status == 200) {
                var  result = ajax.responseText;
                alert(result);
            }
        }
    };
    ajax.open("get", "DepartmentEmployee", true);
    ajax.send(null);
}