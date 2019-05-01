package oop.MultiThreading.example_005;

@SuppressWarnings("WeakerAccess")
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        double currentBalance = getBalance();
        possibleDelay();
        balance = currentBalance - amount;
    }

    public void deposit(double amount) {
        double currentBalance = getBalance();
        possibleDelay();
        balance = currentBalance + amount;
    }

    private void possibleDelay() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Account: " + hashCode() + "\tBalance: " + getBalance();
    }
}
