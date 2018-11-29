package Test1;

public class Test7 {
	public static int method1(int x){
		try{
			if(x<0)
				throw new Exception("x<0");
			return x++;
		}catch(Exception e){
			System.out.println("Wrong");
			return -100;
		}finally{
			System.out.println("Finally");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method1(-1));
	}

}
