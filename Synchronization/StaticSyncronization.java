package Synchronization;

class Counter3 {
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticSyncronization {
    public static void main(String[] args) throws InterruptedException {
        try{
            Thread t1 = new Thread(Counter3::increment);
            Thread t2 = new Thread(Counter3::increment);

            t1.start();
            System.out.println();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Final count: " + Counter3.getCount());  // 2
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
