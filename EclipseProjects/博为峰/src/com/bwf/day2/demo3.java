package com.bwf.day2;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Dog2 dog = new Dog2();
		p.feed(dog);
	}

}

//定义一个Person类
class Person{
	public void feed (Animal4 animal) {//多态的表现
		animal.eat();
	}
}

abstract class Animal4{
	public abstract void eat();
}

class Dog2 extends Animal4{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
	}
	
}