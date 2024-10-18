package Synchronization;

class Sum extends Thread {
    int sum = 0;
    @Override
    public void run(){
        synchronized (this){
            for(int i=0; i< 10; i++){
                sum =  sum+100;
            }
            System.out.println("The Sum before the notify = "+this.sum);
            try {
                wait(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notify();
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {

        Sum obj = new Sum();
        obj.start();
        System.out.println(obj.sum);
        synchronized (obj){
            try {
                obj.wait();
                System.out.println("The Sum = "+obj.sum);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }

    }


}
