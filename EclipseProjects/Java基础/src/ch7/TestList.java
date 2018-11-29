package ch7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> la=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			la.add(i);
		}
		System.out.println("1:"+la);
		
		System.out.println(la.size());
		
		System.out.println(la.get(5));
		
		System.out.println(la.contains(2));
		
		List<Integer> lb=la.subList(2, 5);
		System.out.println("2:"+lb);
		
		System.out.println(la.containsAll(lb));
		System.out.println(la.retainAll(lb));//求交集并放入了la;
		System.out.println("3:"+la);
		
		la.remove(2);
		System.out.println(la.contains(2));
		System.out.println("4:"+la);
		System.out.println(la.contains(4));
		
		//迭代器
		Iterator<Integer> it= la.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		//传统
		for(int i=0;i<la.size();i++){
			System.out.println(la.get(i));
		}
		
		
		//LinkedList;
		List<Integer> list1=new LinkedList<Integer>();
		for(int i=0;i<10;i++){
			list1.add(i);
		}
		System.out.println("1:"+list1);
		
		List<String> List2=new LinkedList<String>();
		List2.add("how");
		List2.add("Are");
		List2.add("you");
		System.out.println("2:"+List2);
		
		Iterator<String> it1= List2.iterator();
		while(it.hasNext()){
			System.out.print(it1.next());
		}
		
	}

}
