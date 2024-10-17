package MultiThreading.Threading;

import MultiThreading.MultiThreading_1;
import MultiThreading.Synchronization.MyThread;

public class MultiThreadingUsingRunnabel_1 implements Runnable{

    @Override
    public void run() {
        System.out.println("This is the runable method thread class ");
    }

    public static void main(String[] args) {
        try{

            MultiThreadingUsingRunnabel_1 t1 = new MultiThreadingUsingRunnabel_1();
            Thread t = new Thread(t1);
            t.start();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
