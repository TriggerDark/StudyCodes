package Experiment.Second;

import java.util.Random;
import java.util.Scanner;

public class Ramdom {
	public static void Guess(int x,int realNumber){
		if(x>realNumber){
			System.out.println("�´���");
		}else if(x<realNumber){
			System.out.println("��С��");
		}else{
			System.out.println("�¶���");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int realNumber=random.nextInt(100)+1;
		System.out.println(realNumber);
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextInt()){
			int x=scan.nextInt();
			Guess(x,realNumber);
		}
	}
}
