package Test;

public class Employee1 {
	//实际变量
	private String name;
	private double salary;
	private String birth;
	public Employee1(String name){
		//区分实例变量和方法参数的模糊性
		this.name=name;
	}
	public Employee1(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	//可以调用另外一个构造方法
	//在第一行this关键字调用另一个构造方法
	public Employee1(String name,double salary,String birth){
		this(name,salary);
		this.birth=birth;
	}
	public static void main(String[] args) {
		// emp1/emp2局部变量
		Employee1 emp1=new Employee1("张三");
		Employee1 emp2=new Employee1("李四");
		Employee1 emp3=new Employee1("王五",10000);
		Employee1 emp4=new Employee1("王九",1000,"1999-09-2");
	}

}
