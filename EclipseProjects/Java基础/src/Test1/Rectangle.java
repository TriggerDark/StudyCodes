package Test1;

public class Rectangle implements InterFace {
	private double length;
	private double width;
	
	@Override
	public void area(double a, double b) {
		// TODO Auto-generated method stub
		length=a;
		width=b;
		System.out.println("¾ØÐÎarea="+(length*width));
	}

	/*public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}*/

}
