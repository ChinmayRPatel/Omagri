package MultiThreading.Threading;

public class SingleTaskByMultipleTreads_2 extends  Thread{
    public  void run(){
        System.out.println("This is single task by kultip[le thread class " +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SingleTaskByMultipleTreads_2 t2 = new SingleTaskByMultipleTreads_2();
        SingleTaskByMultipleTreads_2 t22 = new SingleTaskByMultipleTreads_2();
        t2.start();
        t22.start();
        Task1 t11 = new Task1();
        Task2 t223 = new Task2();
        t11.start();
        t223.start();
    }
}

class Task1 extends Thread {
    public void run() {
        System.out.println("Task 1 is running...");
    }
}

class Task2 extends Thread {
    public void run() {
        System.out.println("Task 2 is running...");
    }
}