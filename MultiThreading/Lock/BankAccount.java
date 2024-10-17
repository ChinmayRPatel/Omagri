package MultiThreading.Lock;

public class BankAccount {
    private int balance = 100;
    public void widraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attemption to widraw "+ amount);
        if(balance>=amount){
            System.out.println((Thread.currentThread().getName())+" Processing with widrawal");
            try{
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance = balance-amount;
            System.out.println(Thread.currentThread().getName() + " completed widrawal . Remaining balance is "+balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " Insufficient balance");
        }
    }

}
