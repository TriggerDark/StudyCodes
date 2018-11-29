package Test1;

public class ParivateOverride {
	private void f(){
		System.out.println("private f()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParivateOverride po=new Derived();
		po.f();
	}
}
class Derived extends ParivateOverride{
	public void f(){
		System.out.println("public f()");
	}
}