package old_examples.MultiThreading.example_006;

public class AccountDepositer implements Runnable {
    private BankAccount account;
    private double amount;

    public AccountDepositer(BankAccount bankAccount, double amount) {
        this.account = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}
