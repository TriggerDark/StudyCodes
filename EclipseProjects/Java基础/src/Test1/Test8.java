package Test1;

public class Test8 {
	static int method1(int x)throws Exception {
		if(x<0)
			throw new Exception ("x<0");
		return x++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(method1(1));
			System.out.println("end");
		}catch(Exception e){
			System.out.println("Wrong");
		}finally {
			System.out.println("Finally");
		}
	}

}
