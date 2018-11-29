package Test;

interface B{
	void methodB();
}

interface C{
	void methodC();
}
//接口之间的扩展
interface D extends B,C{
	void methodD();
}

class BImpl implements B{
	@Override
	public void methodB(){};
}
//通过多个接口模拟多重选择
class BCImpl implements B,C{
	public void methodC(){
		
	}
	public void methodB(){
		
	}
}

class DImpl implements D{
	public void methodC(){
		
	}
	public void methodB(){
		
	}
	public void methodD(){
		
	}
}
public interface interfaceA {
	//接口里面的内容，有没有public修饰
	//都不影响它的可见性
	public static final String a="";
	void methodA();
	public void methodB();
}
