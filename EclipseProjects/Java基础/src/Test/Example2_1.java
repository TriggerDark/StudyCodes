package Test;

import java.util.Scanner;

public class Example2_1 {
	private static Scanner scan;

	public static void main (String[] args){
		scan = new Scanner(System.in);
		//java 唯一一个不需要引入就可以使用的包java.lang.*
		//Scanner 提供一系列nextxxx();
//		scan.next();
//		scan.nextInt();
//		scan.nextFloat();
//		scan.nextDouble();
		//从键盘读取若干数字，非数字结束
		//求和   平均值
		int count = 0;
		double sum = 0;
		while(scan.hasNextDouble()){
			double x = scan.nextDouble();
			count = count + 1;
			sum = sum + x;
		}
		System.out.println("和：" + sum);
		//double->Double->toString();
		//double->boxing   自动包装
		System.out.println("平均值" + sum/count);
	}
}
