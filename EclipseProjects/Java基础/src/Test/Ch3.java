package Test;

public class Ch3 {
	public static void main(String[] args){
		//�ȼ۹�ϵ
		int i1=223;
		int i2=34;
		if(i1==i2){
			System.out.println("��");
		}else{
			System.out.println("����");
		}
		Integer i3=new Integer(23);
		Integer i4=new Integer(23);
		System.out.println(i3==i4);
		System.out.println(i3!=i4);
		
		String s1=new String("Hello");
		String s2=new String("World");
		String s3=new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		//���
		//0   0-->0
		//0   1-->1
		//1   0-->1
		//1   1-->0
		//���
		int a=111,b=222,temp;
		//temp=a^b;
		a=a^b;//temp
		b=a^b;//temp^b=a^b^b=a
		a=a^b;//temp^a=a^b^a=b
		System.out.println("a="+a+","+"b="+b);
	}
}
