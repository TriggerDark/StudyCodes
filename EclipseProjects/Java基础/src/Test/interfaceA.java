package Test;

interface B{
	void methodB();
}

interface C{
	void methodC();
}
//�ӿ�֮�����չ
interface D extends B,C{
	void methodD();
}

class BImpl implements B{
	@Override
	public void methodB(){};
}
//ͨ������ӿ�ģ�����ѡ��
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
	//�ӿ���������ݣ���û��public����
	//����Ӱ�����Ŀɼ���
	public static final String a="";
	void methodA();
	public void methodB();
}
