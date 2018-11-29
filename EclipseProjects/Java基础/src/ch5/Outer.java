package ch5;

interface OuterIFC {
	void method();
}

public class Outer {
	public class Inner1 {
	} //实例内部类
	//静态内部类
	public static class Inner2 {
	}

	private OuterIFC o = new OuterIFC() {
		int i = 1;
		public void method() {
			i++;
		}
	}; //一个实现了OuterIFC接口的匿名类

	OuterIFC getInstance() {
		return o;
	}

	void outerMethod() {
		class Inner3 {
		} //局部内部类
		Inner3 in = new Inner3();
	}
} //end of class Outer