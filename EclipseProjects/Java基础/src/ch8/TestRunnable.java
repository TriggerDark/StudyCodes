package ch8;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr=new MyRunnable();
		Thread t1=new Thread(mr);
		Thread t2=new Thread(mr);
		t1.start();
		t2.start();
	}

}
