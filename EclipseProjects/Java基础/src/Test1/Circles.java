package Test1;

public class Circles implements InterFace {
	private double radius;
	public double PI;
	
	@Override
	public void area(double a, double b) {
		// TODO Auto-generated method stub
		radius=a;
		PI=b;
		System.out.println("Բarea="+(radius*radius*PI));
	}

/*	public double getRadius() {
		return radius;
	}

	public double getPI() {
		return PI;
	}
*/
}
