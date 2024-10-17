package MultiThreading.Threading;

public class MultiThreading_1 extends Thread{
    public static void main(String[] args) {
        World world = new World();
//        If World class implements the runnable class then create the object with Thread object
        Thread t = new Thread(world);
        t.start();
        for(int i=0; i< 10000;i++){
            System.out.println("Hello ----");
        }
//        System.out.println(Thread.currentThread().getName());
    }
}
