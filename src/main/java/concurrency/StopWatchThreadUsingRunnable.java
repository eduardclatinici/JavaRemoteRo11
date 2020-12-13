package concurrency;

public class StopWatchThreadUsingRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Stop watch: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        StopWatchThreadUsingRunnable stopWatchThreadUsingRunnable = new StopWatchThreadUsingRunnable();
        Thread stopWatchThread = new Thread(stopWatchThreadUsingRunnable);
        Thread stopWatchThread2 = new Thread(stopWatchThreadUsingRunnable);
        stopWatchThread.start();
        stopWatchThread2.start();
    }
}
