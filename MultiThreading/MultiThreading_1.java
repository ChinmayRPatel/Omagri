package MultiThreading;

public class MultiThreading_1 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello this is thread method");
    }

    public static void main(String[] args) {
        MultiThreading_1 t1 = new MultiThreading_1();
        t1.run();
        System.out.println("This is main thread");
    }
}
