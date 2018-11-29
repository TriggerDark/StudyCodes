package ch4;
public class TestVarargs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display(10);
		display(10,20);

	}
	
	static void display(int ...a) {
		System.out.println("Number of arguments: " + a.length + " Contents.");
		for (int x: a) {
			System.out.println(x);
			
		}
		System.out.println("***********************");
	}

}
