package ch7;

import java.util.ArrayList;
import java.util.List;

public class TestWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> apples=new ArrayList<Apple>();
		for(int i=0;i<5;i++){
			apples.add(new Apple());
		}
		//加了泛型以后,帮助你在编译时刻显错
		//apples.add(new Orange());
		for(int i=0;i<apples.size();i++){
			((Apple)apples.get(i)).getID();
		}
	}

}
