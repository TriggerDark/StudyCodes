package Test;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args){
		float [] boy1;
		boy1 = new float[4];
		float[] boy2=new float[4];
		float[] boy3={123.84f,9884.23f,287,43};
		float[] boy4=new float[4];
		//二维数组看做是数组的数组
		int [][] a=new int[3][];
		a[0]=new int[6];
		a[1]=new int[8];
		a[2]=new int[3];
		//数组的使用
		//属性：length,代表实际存放数据的个数
		//数组的遍历
		//下标：0~length-1
		for(int i=0;i<boy3.length;i++){
			System.out.println(boy3[i]);
		}
		//增强的for循环
		for(float element:boy3){
			System.out.println(element);
		}
		//数组的复制
		System.arraycopy(boy3, 0, boy1, 0, boy3.length);
		boy2=Arrays.copyOf(boy3,boy3.length);
		boy4=Arrays.copyOfRange(boy3,0,2);
		//数组转换成字符串
		System.out.println(Arrays.toString(boy3));
		//排序
		Arrays.sort(boy3);
		//二分查找
		//返回值是整形找到就是元素的位置，没找到返回一个负数
		System.out.println(Arrays.binarySearch(boy3, 4));
	}
}
