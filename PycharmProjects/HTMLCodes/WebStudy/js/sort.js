s//ort()按照升序排列数组项，对每个数组项调用toString()

var arr1 = ["a", "b", "c", "d"];
arr1.sort();
var arr2 = [13,24,51,3];
arr2.sort();//每一项是数值，也是比较字符串

function compare (v1, v2) {
	if(v1 > v2){
		return -1;
	}else if (v1 < v2) {
		return 1;
	}else {
		return 0;
	}
}
arr2.sort(compare)