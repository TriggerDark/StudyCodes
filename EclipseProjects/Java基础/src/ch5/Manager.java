package ch5;

import java.text.SimpleDateFormat;
import java.util.Date;

class Employee {
	private String name;
	private double salary;
	private Date birthDate;

	public Employee(String name, double salary, Date date) {
		this.name = name;
		this.salary = salary;
		this.birthDate = date;
	}

	public String getDetails() {
		return "Name: " + name + " Salary: " + salary + " birthDate: " + birthDate;
	}
}

public class Manager extends Employee{
	private String department;
	
	public Manager(String name, double salary, Date date, String dept) {
		//主动地调用父类的构造方法
		//supper关键字，而且是构造方法的第一行
    	super(name, salary, date);
		department = dept;
	}

	public String getDetails() {
		return super.getDetails() + " Department: " + department;
	}
	
	public static void main(String[] args) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
			Date date = format.parse("8-8-1980");
			Employee e = new Manager("Mary", 15000.0, date, "Sales");
			Manager m = new Manager("Mary", 15000.0, date, "Sales");
			System.out.println(e.getDetails());
			System.out.println(m.getDetails());
		} catch (Exception e) {
			e.printStackTrace();
        }
	}
}
