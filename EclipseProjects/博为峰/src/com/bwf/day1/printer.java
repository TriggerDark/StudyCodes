package com.bwf.day1;

public class printer {
	/*多态;
	 * 多态要依托于继承关系
	 * 父类类型的对象可以调用子类对象的引用
	 *
	 */
	public static void main(String[] args) {
		ColorPrinter cp = new ColorPrinter("惠普");
		BlackPrinter bp = new BlackPrinter("联想");
		School school = new School();
		
//		school.setBlackPrinter(bp);
//		school.setColorPrinter(cp);
//		school.setPrinter(cp);
		school.setPrinter(bp);
		school.print("欢迎来到王者荣耀");
	}
}

abstract class PrinterInfor{
	private String brand;
	public PrinterInfor(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
//	public void print(String context) {
//		
//	}
	/*
	 * 抽象方法，只包含方法头，没有方法体的方法，可以定义为抽象方法
	 * 包含抽象方法的类必须定义为抽象类，抽象类可以不包含任何抽象方法
	 * 抽象类是不可以实例化的，抽象类可能有抽象方法，抽象方法是没有方法的，不可以被调用
	 * 一旦一个子类继承了抽象类，需要实现抽象类的所有方法
	 * @param context
	 */
	public abstract void print(String context);
}

class ColorPrinter extends PrinterInfor{
	public ColorPrinter(String brand) {
		super(brand);
	}
	 public void print(String context) {
		 System.out.println(getBrand() + "彩色打印机" + context);
		 
	 }
}

class BlackPrinter extends PrinterInfor{

	public BlackPrinter(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	public void print(String context) {
		System.out.println(getBrand() + "黑白打印机" + context);
	}
}

class School{
//	private ColorPrinter cp = null;
//	private BlackPrinter bp = null;
//	
//	public void setColorPrinter(ColorPrinter cp) {
//		this.cp = cp;
//	}
//	
//	public void setBlackPrinter(BlackPrinter bp) {
//		this.bp = bp;
//	}
//	public void print(String context) {
//		bp.print(context);
//	}
	private PrinterInfor p = null;
	public void setPrinter(PrinterInfor p) {
		this.p = p;
	}
	public void print(String context) {
		p.print(context);
	}
}