package MultiThreading;

import MultiThreading.Threading.MultiThreading_1;

public class MultipleTaskByAnonymousRunnabel_7 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i< 10; i++){
                    System.out.println(Thread.currentThread().getName() + " is running with i = "+i);
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i< 10; i++){
                    System.out.println(Thread.currentThread().getName() + " is running with i = "+i);
                }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r2);
        Thread t4 = new Thread(r2);
        t1.setName("ThreadOf_R1");
        t2.setName("ThreadOf_R1");
        t3.setName("ThreadOf_R2");
        t4.setName("ThreadOf_R2");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
