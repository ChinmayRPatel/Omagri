package Synchronization;

class Bank extends  Thread{
    static int bal=5000;
    static int widraw=0;
    Bank(int widraw){
        this.widraw=widraw;
    }

    public synchronized static void methodstatic(){
        if(widraw<=bal){
            System.out.println(Thread.currentThread().getName()+ " widraw money");
            bal = bal-widraw;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println(Thread.currentThread().getName()+ " Insufficient balance");
        }
    }
    public void run(){
        methodstatic();
    }
}
public class StaticSynchronizedBlock_Final {

    public static void main(String[] args) {
        Bank obj = new Bank(5000);
        Bank obj2 = new Bank(5000);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);

        t1.setName("Alok");
        t2.setName("Babita");
        t3.setName("Chiku");
        t4.setName("Dimpal");


        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
