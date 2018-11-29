package Test;

class Employee{
	public void playRole(){
		
	}
}

class Engineer extends Employee{
	public void playRole(){
		//Engineer role
	}
}

class Manager extends Employee{
	public void playRole(){
		//Manager role
	}
}
public class TestInstanceOf {
	public void doRole(Employee emp){
		if(emp instanceof Engineer){
			Engineer e=(Engineer)emp;
		}else if(emp instanceof Manager){
			
		}else{
			
		}
	}
	public static void main(String[] args){
		
	}
}
