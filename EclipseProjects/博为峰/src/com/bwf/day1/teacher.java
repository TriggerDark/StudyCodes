package com.bwf.day1;

public class teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTeacher jt = new JavaTeacher("����", "���տƼ���ѧ", 38);
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
		System.out.println("��ʦ�����ڿ�");
	}
}

class JavaTeacher extends teacherInfor{
	private int age;
	
	public JavaTeacher(String name, String school, int age) {
		//���ø���Ĺ��췽��
		super(name, school);
		this.age = age;
	}
	
	//��д����ķ���
	public void teaching() {
		System.out.println("age��" + age);
		System.out.println("��Java��");
	}
}