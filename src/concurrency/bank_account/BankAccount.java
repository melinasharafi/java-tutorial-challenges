package concurrency.bank_account;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        lock.lock();
        balance += amount;
        lock.unlock();
    }

    public synchronized void withdraw(double amount) {
        lock.lock();
        balance -= amount;
        lock.unlock();
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number = " + this.accountNumber);
    }
}
