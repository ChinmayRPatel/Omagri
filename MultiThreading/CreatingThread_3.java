package MultiThreading;

public class CreatingThread_3 extends Thread{
    @Override
    public void run(){
        for(int i=0; i< 100; i++){
            System.out.println(Thread.currentThread().getName() + " is running with i = "+i);
        }
    }
    public static void main(String[] args) {
        CreatingThread_3 t1 = new CreatingThread_3();
        CreatingThread_3 t2 = new CreatingThread_3();
        t1.start();
        t2.start();


    }
}
