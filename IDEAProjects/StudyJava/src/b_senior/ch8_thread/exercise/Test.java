package b_senior.ch8_thread.exercise;

public class Test {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Thread producer = new Thread(new Producer(movie));
        Thread consumer = new Thread(new Consumer(movie));
        producer.start();
        consumer.start();
    }
}
