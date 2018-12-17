var sum = 0;
function calSum(){
	sum += 1;
	postMessage(sum);
	setTimeout("calSum()", 500)
}
calSum();