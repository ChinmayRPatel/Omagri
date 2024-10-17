package MultiThreading.All;

import MultiThreading.Threading.MyThread;

public class InterruptClassInThread extends Thread {

    public InterruptClassInThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0; i<5;i++){
            System.out.println(Thread.currentThread().getName() +" Is srunning ");
//            This will give the chance to another thread to execute at a time
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        InterruptClassInThread t1 = new InterruptClassInThread("A");
        InterruptClassInThread t2 = new InterruptClassInThread("B");
        t1.start();
        t2.start();


    }
}
