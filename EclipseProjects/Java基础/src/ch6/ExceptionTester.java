package ch6;

class Sample {
	int method1(int x) throws Exception {
		if (x < 0)
			throw new Exception("x<0");
		return x++;
	}
}
public class ExceptionTester {
	public static void main(String args[]) throws Exception {
		try {
			System.out.println("Begin");
			new Sample().method1(-1); // 出现SpecialException异常
			//System.exit(0);
		} catch (Exception e) {
			System.out.println("Wrong");
			//throw e; // 如果把此行注释掉，将得到不同的运行结果
		} finally {
			System.out.println("Finally");
		}
		System.out.println("End");
	}

}
