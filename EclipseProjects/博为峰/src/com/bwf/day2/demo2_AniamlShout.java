package com.bwf.day2;

public class demo2_AniamlShout {
	/**
	 * �����ڲ���
	 * new ����(�����б�)���߸��ӿ�{���󷽷��ľ���ʵ��}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animalShout(new Animal3() {
			public void shout() {
				System.out.println("����");
			}
		});
	}
	
	//����һ��animalShout(Animal3 an3)����
	public static void animalShout(Animal3 an3) {
		an3.shout();
	}
	
}
//����һ���ӿ�
interface Animal3{
	void shout();
}