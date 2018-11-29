package Test1;

class Animal{
	Animal (){
		System.out.println("Animal constructor");
	}
}

class Cat extends Animal{
	Cat(){
		System.out.println("Cat constructor");
	}
}
public class Kitty extends Cat{
	Kitty(){
		System.out.println("Kitty construstor");
	}
	public static void main(String[] args){
		Kitty x = new Kitty();
	}
}
