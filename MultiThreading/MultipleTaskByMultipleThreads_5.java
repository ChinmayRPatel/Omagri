package MultiThreading;

class Task1 implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task 1 executed by thread: " + Thread.currentThread().getName());
    }
}

// Task 2
class Task2 implements Runnable {
    public void run() {
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
        System.out.println("Task 2 executed by thread: " + Thread.currentThread().getName());
    }
}
public class MultipleTaskByMultipleThreads_5 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);
        t1.setName("Thread1");
        t2.setName("Thread1");
        Thread t3 = new Thread(task2);
        Thread t4 = new Thread(task2);
        t3.setName("Thread2");
        t4.setName("Thread2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
