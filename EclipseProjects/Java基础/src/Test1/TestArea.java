package Test1;

import java.util.Scanner;

public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI=3.14;
		
		Scanner scan=new Scanner(System.in);
		double radius=scan.nextDouble();
		double length=scan.nextDouble();
		double width=scan.nextDouble();
		
		Circles cir=new Circles();
		cir.area(radius, PI);
		
		Rectangle re=new Rectangle();
		re.area(length, width);
	}

}
