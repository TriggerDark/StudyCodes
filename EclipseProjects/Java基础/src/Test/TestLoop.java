package Test;

public class TestLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<10;i++){
			System.out.print(i);
		}
		System.out.println();
		while(i>0){
			System.out.print(i);
			i--;
		}
		System.out.println();
		
		//%3->foo,%5->bar,%7->baz
		//50Êý
		for(int j=1;j<=50;j++){
			System.out.println();
			System.out.print(j);
			if(j%3==0){
				System.out.print(" foo");
			}
			if(j%5==0){
				System.out.print(" bar");
			}
			if(j%7==0){
				System.out.print(" baz");
			}
			System.out.println();
		}
		
		//8+88+888+....
		long sum=0,a=8,item=a,n=12,k=1;
		for(k=1;k<=n;k++){
			sum+=item;
			item=item*10+a;
		}
		System.out.println(sum);
	}
}
