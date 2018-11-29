package ch4;

class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println(peeled.isPeeled);
		System.out.println("Yummy");
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		//... remove peel
		apple.isPeeled = true;
		return apple;  //peeled
	}
}

class Apple {
	boolean isPeeled = false;
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
public class PassingThis {

	public static void main(String[] args) {
        new Person().eat(new Apple());
	}

}
