package Synchronization;

public class DeadLock {
        String s1 = "Abc";
        String s2 = "Xyz";
        Thread t1 = new Thread() {

            public void run() {
                while (true) {
                    synchronized (s1) {
                        try {
                            System.out.println(Thread.currentThread().getName()+" is locked by s1 "+ s1);
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Waiting for s2 to unlock");
                        synchronized (s2) {
                            System.out.println(s1 + s2);
                        }
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    synchronized (s2) {
                        System.out.println(Thread.currentThread().getName() + " is locked by s2  "+ s2 );
                        System.out.println("Waiting for s1 to unlock");
                        synchronized (s1) {
                            System.out.println(s1 + s2);
                        }
                    }
                }
            }
        };

    public static void main(String[] args) {
        DeadLock obj = new DeadLock();
        obj.t1.start();
        obj.t2.start();
    }

}