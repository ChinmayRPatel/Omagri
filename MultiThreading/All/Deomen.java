package MultiThreading.All;
//Deomen threads are work in backgrounds
//Garbage collectors
public class Deomen extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello world");
        }
    }
    public static void main(String[] args) {
        Deomen t1  = new Deomen();
        t1.setDaemon(true);
        Deomen t2  = new Deomen();
//        t2.setDaemon(true);

        t1.start();
//        If there is not forther work then thread is deomen then it will terminate but if some threads works are finish but its not a deomen thread then it will continously start working
//        t2.start();
        System.out.println("Main  Done");
    }
}
