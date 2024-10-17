package MultiThreading.Threading;

public class AnonymousThreadCreate {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Task 1 running");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("Task 2 running");
            }
        };

        t1.start();
        t2.start();
    }
}
