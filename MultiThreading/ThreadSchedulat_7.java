package MultiThreading;

import MultiThreading.Synchronization.MyThread;

public class ThreadSchedulat_7 extends Thread{
        public void run() {
            System.out.println("Running thread: " + Thread.currentThread().getName() +
                    " with priority: " + Thread.currentThread().getPriority());
        }

        public static void main(String[] args) {
            ThreadSchedulat_7 t1 = new ThreadSchedulat_7();
            ThreadSchedulat_7 t2 = new ThreadSchedulat_7();
            t1.setName("High priority");
            t2.setName("Low priority");

            t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
            t2.setPriority(Thread.MAX_PRIORITY);  // Priority 10

            t1.start();
            t2.start();
        }
}
