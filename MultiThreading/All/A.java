package MultiThreading.All;

public class A extends  Thread{
    @Override
    public void run() {
        try {
            for(int i=0; i<10;i++){
                Thread.sleep(1000);
                System.out.println(i+1);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupt is called");
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
        System.out.println("HEllo before join");
        a1.interrupt();

        try {
            a1.join();
            System.out.println("HEllo immmediate after join ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("HEllo");
    }
}
