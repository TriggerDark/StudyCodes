package ch7;

import java.util.HashSet;

public class ErrorExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int begin = 12345;
		int end = 98765;
		int []each=new int[5];
		int temp=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int totalnum =0;
		for (int number = begin;number<=end;number++) {
			//找出5个数字
			int j = 10000;
			int num = number;
			int i = 0;
			while (j>=10) {
				each[i] = num/j;
				temp = num%j;
				num = temp;
				//System.out.print(each[i]);
				i++;
				j = j / 10;
				
			}
			each[i]=temp;
//			System.out.print(each[i]);
//			System.out.println();
			
			
//			HashSet<Integer> hs = new HashSet<Integer>();
//			StringBuffer sb = new StringBuffer(String.valueOf(number));
//			for (int cha = 0; cha < sb.length(); cha++) {
//				if (sb.charAt(cha) == '0'){
//					continue outer;
//				}
//				hs.add(sb.charAt(cha) - 48);
//			}	
			
			a=each[0];
			b=each[1];
			c=each[2];
			d=each[3];
			e=each[4];
			
			if((a==0)||(b==0)||(c==0)||(d==0)||(e==0)) continue;
			if ((a==b)||(a==c)||(a==d)||(a==e)) continue;
			if ((b==c)||(b==d)||(b==e)) continue;
			if ((c==d)||(c==e)) continue;
			if (d==e) continue;
			
			if (((a*10+b) * (c*100+d*10+e))== ((a*100+d*10+b) * (c*10+e))) {
				totalnum++;
				//ab * cde = adb * ce 
				System.out.println("表达式" + totalnum +":" + a+b+"*"+c+d+e+"="+a+d+b+"*"+c+e);
			}
			
		}
		
		System.out.println("totalnum:" + totalnum);

	}
}
