package com.bwf.day1;

public class teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTeacher jt = new JavaTeacher("张三", "江苏科技大学", 38);
		jt.teaching();
	}
}

class teacherInfor{
	private String name;
	private String school;
	
	public teacherInfor(String name, String school) {
		this.name = name;
		this.school = school;
	}
	
	public void teaching() {
		System.out.println("老师正在授课");
	}
}

class JavaTeacher extends teacherInfor{
	private int age;
	
	public JavaTeacher(String name, String school, int age) {
		//调用父类的构造方法
		super(name, school);
		this.age = age;
	}
	
	//重写父类的方法
	public void teaching() {
		System.out.println("age：" + age);
		System.out.println("上Java课");
	}
}