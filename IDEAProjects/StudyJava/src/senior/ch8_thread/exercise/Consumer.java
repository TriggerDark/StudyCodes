package senior.ch8_thread.exercise;

/**
 * @author SuperStar
 */

public class Consumer implements Runnable {
    private Movie movie = null;

    public Consumer(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.movie.get();
        }
    }
}
