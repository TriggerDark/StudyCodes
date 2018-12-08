package com.bwf.day1;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		int[] arr = new int[]{1, 2, 3, 4};
		String str = "hello";
		System.out.println(a);
		System.out.println(arr[arr.length-1]);
		System.out.println(str);
		numTest(a);
		arrayTest(arr);
		strTest(str);
		System.out.println(a);
		System.out.println(arr[arr.length-1]);
		System.out.println(str);
	}
	public static void numTest(int num) {
		num = 100;
	}
	public static void arrayTest(int[] arr) {
		arr[arr.length-1] = 100;
	}
	public static void strTest(String str) {
		str = "world";
	}
}
