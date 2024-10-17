package MultiThreading.Threading;

public class SleepingThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Thread woke up after sleeping for 1 second");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
    }
}
