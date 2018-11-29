package Experiment.Second;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0,item=1.0;
		int i=1;
		while(i<=20){
			sum+=item;
			item=item*(1.0/++i);
		}
		System.out.println("1+1/2!+...+1/20!="+sum);
	}
}
