package com.bwf.day2;

public class demo1_interfaceM {
	/*
	 * �ӿڣ�
	 * 	������������з������ǳ��󷽷�������԰�����ඨ��Ϊ�ӿ�
	 * 	�ɳ����ͳ��󷽷���ɵ������࣬�ǶԳ��󷽷��Ľ�һ��ʵ��
	 * 
	 * 	����Ĭ��ʹ��public static final������
	 * 	����Ĭ��ʹ��public abstract������
	 * 
	 * 	�ӿڲ�����ʵ�������ӿ��е�����ֻ���ǳ���
	 * 	�ӿ�֮����ڶ�̳�
	 * 	һ����Ҳ����ʵ�ֶ����ͬ�ӿ�
	 * 	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.breathe();
		dog.liveOnland();
		dog.run();
		dog.run2();
		dog.breathe2();
	}

}
//����һ����Ľӿ�
interface Animal{
	//��������
	String Animal_behavior = "�������Ϊ";
	//���巽��
	void breathe();
	void run();
}


interface Animal2{
	String Animal_behavior2 = "����2����Ϊ";
	void breathe2();
	void run2();
}

interface LandAnimal extends Animal, Animal2{
	void liveOnland();
}
class Dog implements LandAnimal{

	
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior + ":���ں���");
	}

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior + ":������");
	}

	
	public void liveOnland() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior + ":��������½��");
	}

	
	public void breathe2() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior2 + ":���ں���");
	}

	
	public void run2() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior2 + ":������");
	}
	
}