package Test;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args){
		float [] boy1;
		boy1 = new float[4];
		float[] boy2=new float[4];
		float[] boy3={123.84f,9884.23f,287,43};
		float[] boy4=new float[4];
		//��ά���鿴�������������
		int [][] a=new int[3][];
		a[0]=new int[6];
		a[1]=new int[8];
		a[2]=new int[3];
		//�����ʹ��
		//���ԣ�length,����ʵ�ʴ�����ݵĸ���
		//����ı���
		//�±꣺0~length-1
		for(int i=0;i<boy3.length;i++){
			System.out.println(boy3[i]);
		}
		//��ǿ��forѭ��
		for(float element:boy3){
			System.out.println(element);
		}
		//����ĸ���
		System.arraycopy(boy3, 0, boy1, 0, boy3.length);
		boy2=Arrays.copyOf(boy3,boy3.length);
		boy4=Arrays.copyOfRange(boy3,0,2);
		//����ת�����ַ���
		System.out.println(Arrays.toString(boy3));
		//����
		Arrays.sort(boy3);
		//���ֲ���
		//����ֵ�������ҵ�����Ԫ�ص�λ�ã�û�ҵ�����һ������
		System.out.println(Arrays.binarySearch(boy3, 4));
	}
}
