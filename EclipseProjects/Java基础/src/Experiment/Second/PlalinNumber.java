package Experiment.Second;

import java.util.Scanner;

public class PlalinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int k=x;
		int[] a=new int[5];
		int i=0,num=0;
		while(k>0){
			a[i]=k%10;
			k/=10;
			num=num*10+a[i];
			i++;
		}
		if(x==num) System.out.println(x+"是回文数");
		else System.out.println(x+"不是回文数");
	}
}
