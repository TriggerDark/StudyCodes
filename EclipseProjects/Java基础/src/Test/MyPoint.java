package Test;

class MyPoint1{
	private int x;
	private int y;
	public MyPoint1(int i,int j){
		x=i;
		y=j;
	}
	public String torString(){
		return("["+x+","+y+"]");
	}
}
public class MyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint1 p1=new MyPoint1(1,2);
		System.out.println(p1.torString());
	}

}
