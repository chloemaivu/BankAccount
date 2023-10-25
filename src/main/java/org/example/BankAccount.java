package org.example;

public class BankAccount {
    double balance;
    double minimumBalance;
    String name;

    public BankAccount(double balance, double minimumBalance, String name) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.name = name;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit cannot be negative");
        } else {
            balance += amount;
        }
        return balance;
    }

    public double withdraw(double amount) {
        double availableAmount = Math.abs(minimumBalance) + balance;
        if (amount > availableAmount) {
            throw new IllegalArgumentException("You have insufficient funds.");
        } else {
            balance -= amount;
        }
        return balance;
    }
}
