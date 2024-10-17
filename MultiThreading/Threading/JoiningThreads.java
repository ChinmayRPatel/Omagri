package MultiThreading.Threading;

public class JoiningThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread 1 running"));
        Thread t2 = new Thread(() -> {
            try {
                t1.join();
                System.out.println("Thread 2 running after Thread 1 completes");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}

