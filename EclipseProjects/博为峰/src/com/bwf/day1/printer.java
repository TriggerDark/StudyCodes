package com.bwf.day1;

public class printer {
	/*��̬;
	 * ��̬Ҫ�����ڼ̳й�ϵ
	 * �������͵Ķ�����Ե���������������
	 *
	 */
	public static void main(String[] args) {
		ColorPrinter cp = new ColorPrinter("����");
		BlackPrinter bp = new BlackPrinter("����");
		School school = new School();
		
//		school.setBlackPrinter(bp);
//		school.setColorPrinter(cp);
//		school.setPrinter(cp);
		school.setPrinter(bp);
		school.print("��ӭ����������ҫ");
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
	 * ���󷽷���ֻ��������ͷ��û�з�����ķ��������Զ���Ϊ���󷽷�
	 * �������󷽷�������붨��Ϊ�����࣬��������Բ������κγ��󷽷�
	 * �������ǲ�����ʵ�����ģ�����������г��󷽷������󷽷���û�з����ģ������Ա�����
	 * һ��һ������̳��˳����࣬��Ҫʵ�ֳ���������з���
	 * @param context
	 */
	public abstract void print(String context);
}

class ColorPrinter extends PrinterInfor{
	public ColorPrinter(String brand) {
		super(brand);
	}
	 public void print(String context) {
		 System.out.println(getBrand() + "��ɫ��ӡ��" + context);
		 
	 }
}

class BlackPrinter extends PrinterInfor{

	public BlackPrinter(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	public void print(String context) {
		System.out.println(getBrand() + "�ڰ״�ӡ��" + context);
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