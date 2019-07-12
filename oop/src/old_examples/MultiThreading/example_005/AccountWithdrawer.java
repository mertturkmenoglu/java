package old_examples.MultiThreading.example_005;

public class AccountWithdrawer implements Runnable {
    private BankAccount account;
    private double amount;

    public AccountWithdrawer(BankAccount bankAccount, double amount) {
        this.account = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
