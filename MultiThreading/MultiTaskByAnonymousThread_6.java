package MultiThreading;

import MultiThreading.Threading.MultiThreading_1;

public class MultiTaskByAnonymousThread_6 {
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                    for(int i=0; i< 100; i++){
                        System.out.println(Thread.currentThread().getName() + " is running and i = "+ i);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(1);
                    for(int i=0; i< 100; i++){
                        System.out.println(Thread.currentThread().getName()+ " is running and i = "+i);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        t1.start();
        t2.start();

    }
}
