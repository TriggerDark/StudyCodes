package Test;

public class Employee1 {
	//ʵ�ʱ���
	private String name;
	private double salary;
	private String birth;
	public Employee1(String name){
		//����ʵ�������ͷ���������ģ����
		this.name=name;
	}
	public Employee1(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	//���Ե�������һ�����췽��
	//�ڵ�һ��this�ؼ��ֵ�����һ�����췽��
	public Employee1(String name,double salary,String birth){
		this(name,salary);
		this.birth=birth;
	}
	public static void main(String[] args) {
		// emp1/emp2�ֲ�����
		Employee1 emp1=new Employee1("����");
		Employee1 emp2=new Employee1("����");
		Employee1 emp3=new Employee1("����",10000);
		Employee1 emp4=new Employee1("����",1000,"1999-09-2");
	}

}
