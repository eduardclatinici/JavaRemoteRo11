package concurrency;

public class SeatTakerThread extends Thread {

    private Bench bench;

    public SeatTakerThread(Bench bench) {
        this.bench = bench;
    }

    @Override
    public void run() {
        bench.takeASeat();
        //methodWithSyncedCodeBlock();
    }

    public void methodWithSyncedCodeBlock() {
        System.out.println("Unsynced part");
        synchronized (this) {
            System.out.println("Synced part");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Bench bench = new Bench(1); // creating bench with one free seat
        SeatTakerThread seatTaker1 = new SeatTakerThread(bench);
        SeatTakerThread seatTaker2 = new SeatTakerThread(bench);
        seatTaker1.start();
        seatTaker2.start();
    }

}
