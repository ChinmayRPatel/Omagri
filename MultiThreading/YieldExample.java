package MultiThreading;

public class YieldExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            // Yield control to another thread
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldExample t1 = new YieldExample();
        YieldExample t2 = new YieldExample();

        // Starting both threads
        t1.start();
        t2.start();
    }
}