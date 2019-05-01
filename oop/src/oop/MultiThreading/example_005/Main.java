package oop.MultiThreading.example_005;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BankAccount customerAccount = new BankAccount(0);
        System.out.println("Before: " + customerAccount.toString());

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            AccountDepositer depositTask = new AccountDepositer(customerAccount, 1);
            executor.execute(depositTask);
        }

        for (int i = 0; i < 50; i++) {
            AccountWithdrawer withdrawTask = new AccountWithdrawer(customerAccount, 1);
            executor.execute(withdrawTask);
        }

        executor.shutdown();

        while (!executor.isTerminated());

        System.out.println("After: " + customerAccount.toString());

    }
}
