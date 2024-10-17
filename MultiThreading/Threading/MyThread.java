package MultiThreading.Threading;
//Start, run , sleep , join, priority, thread name
public class MyThread extends Thread{

//    Here we can set the name of tread using the constructor of current class
    public MyThread (String s){
        super(s);
    }
    @Override
    public void run() {
        for(int i=0; i< 5;i++){
            System.out.println(Thread.currentThread().getName() + " - priority "+ Thread.currentThread().getPriority() + " count"+i);
            try{
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread l = new MyThread("Low p");
        MyThread m = new MyThread("Med p");
        MyThread h = new MyThread("High p");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
