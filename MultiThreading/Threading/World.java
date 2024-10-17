package MultiThreading.Threading;

//public class World extends Thread{
public class World implements  Runnable{
    @Override
    public void run() {
        for(int i=0 ; i<100; i++){
            System.out.println("World");
        }
    }
}
