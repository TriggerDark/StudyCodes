package ch8;

class MyThread extends Thread{
	public void run(){
		for(int i=0;i<50;i++){
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		t1.run();
	}

}
