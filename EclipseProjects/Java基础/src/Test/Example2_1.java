package Test;

import java.util.Scanner;

public class Example2_1 {
	private static Scanner scan;

	public static void main (String[] args){
		scan = new Scanner(System.in);
		//java Ψһһ������Ҫ����Ϳ���ʹ�õİ�java.lang.*
		//Scanner �ṩһϵ��nextxxx();
//		scan.next();
//		scan.nextInt();
//		scan.nextFloat();
//		scan.nextDouble();
		//�Ӽ��̶�ȡ�������֣������ֽ���
		//���   ƽ��ֵ
		int count = 0;
		double sum = 0;
		while(scan.hasNextDouble()){
			double x = scan.nextDouble();
			count = count + 1;
			sum = sum + x;
		}
		System.out.println("�ͣ�" + sum);
		//double->Double->toString();
		//double->boxing   �Զ���װ
		System.out.println("ƽ��ֵ" + sum/count);
	}
}
