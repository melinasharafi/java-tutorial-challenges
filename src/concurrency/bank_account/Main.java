package concurrency.bank_account;

public class Main {
    public static void main(String[] args) {

        BankAccount1 bankAccount = new BankAccount1("12345-678", 1000.00);

        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(300.00);
                bankAccount.withdraw(50.00);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(203.75);
                bankAccount.withdraw(100.00);
            }
        }).start();
    }
 }
