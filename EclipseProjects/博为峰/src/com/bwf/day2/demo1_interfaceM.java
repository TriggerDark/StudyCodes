package com.bwf.day2;

public class demo1_interfaceM {
	/*
	 * 接口：
	 * 	如果这各类的所有方法都是抽象方法，则可以把这个类定义为接口
	 * 	由常量和抽象方法组成的特殊类，是对抽象方法的进一步实现
	 * 
	 * 	属性默认使用public static final来修饰
	 * 	方法默认使用public abstract来修饰
	 * 
	 * 	接口不可以实例化，接口中的属性只能是常量
	 * 	接口之间存在多继承
	 * 	一个类也可以实现多个不同接口
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
//定义一个类的接口
interface Animal{
	//定义属性
	String Animal_behavior = "动物的行为";
	//定义方法
	void breathe();
	void run();
}


interface Animal2{
	String Animal_behavior2 = "动物2的行为";
	void breathe2();
	void run2();
}

interface LandAnimal extends Animal, Animal2{
	void liveOnland();
}
class Dog implements LandAnimal{

	
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior + ":狗在呼吸");
	}

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior + ":狗在跑");
	}

	
	public void liveOnland() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior + ":狗生活在陆地");
	}

	
	public void breathe2() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior2 + ":狗在呼吸");
	}

	
	public void run2() {
		// TODO Auto-generated method stub
		System.out.println(Animal_behavior2 + ":狗在跑");
	}
	
}