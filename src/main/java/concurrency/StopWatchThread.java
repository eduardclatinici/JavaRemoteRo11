package concurrency;

public class StopWatchThread extends Thread{
    private String prefix;

    StopWatchThread(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void run() {
        System.out.println(prefix + " starts");
        for (int i = 0; i < 10; i++) {
            System.out.println(prefix + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(prefix + " ends");
    }

    public static void main(String[] args) throws InterruptedException{
        StopWatchThread stopWatchThread1 = new StopWatchThread("SW1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("SW2");
        stopWatchThread1.start();
        stopWatchThread2.start();
        System.out.println("Main thread starts");
        Thread.sleep(5000);
        System.out.println("Main thread is still running");
        Thread.sleep(5000);
        System.out.println("Main thread ends");

    }
}
