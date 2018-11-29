package Test1;

enum Weekday{
	Sun, Mon, Tue, Wed, Thu, Fri, Sat
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekday[] wd = Weekday.values();
		for(Weekday a:wd){
			System.out.println(a+"");
		}
	}

}
