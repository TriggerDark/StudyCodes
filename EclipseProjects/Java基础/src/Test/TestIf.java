package Test;

public class TestIf {
	public static void main(String[] args){
		//
		//Wrapper class
		//int->Integer
		//char->character
		//float->Float
		int arg0=Integer.parseInt(args[0]);
		if(arg0<10){
			System.out.println("This is argument "+arg0+"小于10岁");
		}else if(arg0<20){
			System.out.println("This is argument "+arg0+"在10岁和20岁之间");
		}
	}
}
