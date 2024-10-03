package OOPs_Concepts;

class ObjectAndClass_1 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ABC", 1000.00);
        account1.addBalance(500);
        account1.withdraw(300);
        System.out.println(account1.getBalance());
        System.out.println(account1.getName());

        BankAccount account2 = new BankAccount("XYZ", 2);
        account2.addBalance(500);
        account2.withdraw(1000);
        System.out.println(account2.getBalance());
        System.out.println(account2.getName());

    }
}

class BankAccount {

    private String fname;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.fname = accountHolder;
        this.balance = initialBalance;
    }

    public void addBalance(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("You Not Have SUFFICIENT balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getName(){
        return fname;
    }


}

