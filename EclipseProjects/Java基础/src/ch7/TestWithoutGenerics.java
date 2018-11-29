package ch7;

import java.util.ArrayList;
import java.util.List;

class Apple{
	private static int counter;
	private int id=counter;
	public int getID(){
		return id;
	}
}

class Orange{
	
}
public class TestWithoutGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List apples=new ArrayList();
		for(int i=0;i<5;i++){
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for(int i=0;i<apples.size();i++){
			((Apple)apples.get(i)).getID();
		}
	}

}
