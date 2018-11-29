package ch5.ShapeInf;

public class Shapes {
	
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	static void select(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
        	s[i] = gen.next();
        }
        
        for (Shape shp : s) {
        	select(shp);
        }
	}
}
