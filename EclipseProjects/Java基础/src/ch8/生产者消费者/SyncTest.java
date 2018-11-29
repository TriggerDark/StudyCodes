package ch8.生产者消费者;

public class SyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack("Mystack");
		Producer p1=new Producer(stack,"Producer1");
		//Producer p2=new Producer("Producer2",stack);
		Consumer c1=new Consumer(stack,"Customer1");
		Consumer c2=new Consumer(stack,"Customer2");
		System.exit(0);
	}

}
