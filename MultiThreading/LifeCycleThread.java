package MultiThreading;

public class LifeCycleThread extends Thread{
    @Override
    public void run(){
        System.out.println("RUNNING");
        try{Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
    }
    public static void main(String[] args) {
        try{

        LifeCycleThread t1 = new LifeCycleThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(1000);
//        below statement will print for current thread
//        System.out.println(Thread.currentThread().getState());
        t1.join();
//        below statement will print for current thread
//        System.out.println(Thread.currentThread().getState());
        System.out.println(t1.getState());

        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
