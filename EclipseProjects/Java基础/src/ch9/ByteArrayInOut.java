package ch9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڴ�д��ASCII���ڶ�����Щ�ӽἰ��Ӧ���ַ�
		int n=-1;
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		for(int i=0;i<127;i++){
			out.write(i);
		}
		ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
		while((n=in.read())!=-1){
			if(n%2==0){
				System.out.printf("\n");
			}
				System.out.printf("\t�ֽ�%d,��Ӧ�ַ�\'%c",n,(char)n);
		}
	}

}
