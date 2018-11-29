package ch7;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListFeatures {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		for(int i=0; i<=60096; i++) {
			list.add("speed" + i);
		}
		
		Iterator<String> iter = list.iterator();
		long starttime = System.currentTimeMillis();
		while (iter.hasNext()) {
			String te = iter.next();
		}
		long endtime = System.currentTimeMillis();
		long result = endtime - starttime;
		System.out.println("ʹ�õ�����������������ʱ�䣺" + result + "����");
		
		starttime = System.currentTimeMillis();
		for (int i=0; i<list.size(); i++) {
			String te = list.get(i);
		}
		endtime = System.currentTimeMillis();
		result = endtime - starttime;	
		System.out.println("ʹ��get����������������ʱ�䣺" + result + "����");

	}

}
