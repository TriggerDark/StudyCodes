package ch5;

interface OuterIFC {
	void method();
}

public class Outer {
	public class Inner1 {
	} //ʵ���ڲ���
	//��̬�ڲ���
	public static class Inner2 {
	}

	private OuterIFC o = new OuterIFC() {
		int i = 1;
		public void method() {
			i++;
		}
	}; //һ��ʵ����OuterIFC�ӿڵ�������

	OuterIFC getInstance() {
		return o;
	}

	void outerMethod() {
		class Inner3 {
		} //�ֲ��ڲ���
		Inner3 in = new Inner3();
	}
} //end of class Outer