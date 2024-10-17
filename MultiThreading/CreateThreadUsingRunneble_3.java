package MultiThreading;

public class CreateThreadUsingRunneble_3 implements Runnable {
    int count =0;
    @Override
    public void run() {
        for(int i=0; i<= 100; i++){
            count++;
            System.out.println(Thread.currentThread().getName() +" is running with i = "+i);
        }
    }

    public static void main(String[] args) {
        CreateThreadUsingRunneble_3 obj = new CreateThreadUsingRunneble_3();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(obj.count);

    }
}
