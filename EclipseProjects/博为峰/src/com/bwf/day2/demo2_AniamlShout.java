package com.bwf.day2;

public class demo2_AniamlShout {
	/**
	 * 匿名内部类
	 * new 父类(参数列表)或者父接口{抽象方法的具体实现}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animalShout(new Animal3() {
			public void shout() {
				System.out.println("旺旺");
			}
		});
	}
	
	//定义一个animalShout(Animal3 an3)方法
	public static void animalShout(Animal3 an3) {
		an3.shout();
	}
	
}
//定义一个接口
interface Animal3{
	void shout();
}