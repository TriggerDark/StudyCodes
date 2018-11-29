package ch4;

public class SendByValue {

    public void increment (int i) {
    	i++;
    	System.out.println(i);
    }
	public static void main(String[] args) {
		SendByValue send = new SendByValue();
		int i = 1;
		send.increment(i);
        System.out.println(i);
	}
}
