var serverData, statusDiv;
var SERVER_URL = "index.php";

window.onload = function () {
    serverData = document.getElementById("serverData");
    statusDiv = document.getElementById("statusDiv");
    startlistenerServer();
};

function startlistenerServer() {
    statusDiv.innerHTML = "start Connect Server...";
    var es = new EventSource(SERVER_URL);
    es.addEventListener("newDate", newDateHandler);
    es.onopen = openHandler;
    es.onerror = errorHandler;
    es.onmessage = messageHandler;
}
function openHandler(e) {
    statusDiv.innerHTML = "Server Open";
}
function errorHandler(e) {
    statusDiv.innerHTML = "Server Error";
}
function messageHandler(e) {
    serverData.innerHTML = e.data;
}
function newDateHandler(e) {
    serverData.innerHTML = e.data;
}