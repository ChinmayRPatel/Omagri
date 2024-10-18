package Synchronization;
class Counter2 {
    private int count = 0;

    public void increment() {
        // Synchronized block
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Counter2 counter = new Counter2();
        try {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final count: " + counter.getCount());  // Should be 2000
    }

}
