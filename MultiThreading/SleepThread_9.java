package MultiThreading;

public class SleepThread_9 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(10);
                    for(int i=0; i<100; i++){
                        System.out.println(Thread.currentThread().getName()+" is work ign and i = "+ i );
                    }
                } catch (InterruptedException  e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                    try {
                        for(int i=0; i<100; i++){
                             Thread.sleep(10);
                            System.out.println(Thread.currentThread().getName()+" is work ign and i = "+i);
                        }

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();


    }
}
