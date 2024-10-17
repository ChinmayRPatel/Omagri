package MultiThreading;

import MultiThreading.Threading.MultiThreading_1;
import MultiThreading.Threading.SingleTaskByMultipleTreads_2;

public class SingleTaskByMultipleThreads_4 implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " and i = " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SingleTaskByMultipleThreads_4 obj = new SingleTaskByMultipleThreads_4();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);
        t1.start();
        t2.start();
        t3.start();
    }
}
