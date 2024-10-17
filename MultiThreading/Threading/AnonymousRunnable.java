package MultiThreading.Threading;

public class AnonymousRunnable {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Task 1 running");
            }
        };

        Runnable r2 = new Runnable() {
            public void run() {
                System.out.println("Task 2 running");
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}