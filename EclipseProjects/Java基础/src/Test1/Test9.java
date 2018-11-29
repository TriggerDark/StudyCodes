package Test1;

public class Test9 {
		static void Return_k(int k){
		int sum=0;
		for(int i=1;i<k;i++){
			if(k%i==0)
				sum+=i;
		}
		if(sum==k){
			System.out.println("k="+k);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++){
			Return_k(i);
		}
	}

}
