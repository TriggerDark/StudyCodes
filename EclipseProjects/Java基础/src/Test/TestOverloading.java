package Test;

public class TestOverloading {
	private String name;
	public void setName(){
		name="����";
	}
	public void setName(String newName){
		name=newName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOverloading tol=new TestOverloading();
		tol.setName();
		tol.setName("����");
		System.out.println(false);
		System.out.println("false");
		System.out.println(3647);
		System.out.println(346.64f);
	}

}
