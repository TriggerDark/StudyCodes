function repeat (str, n) {
	return new Array(n + 1).join(str);
}

repeat("abc", 3)//abcabcabc
repeat("hi", 5)//hihihihihi