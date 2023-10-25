package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void increaseBalance() {
        BankAccount ba = new BankAccount(0, 0, "name");
        double actualBalance = ba.deposit(400);
        assertEquals(400, actualBalance);
    }

    // tests if decrease balance
    @Test
    public void decreaseBalance() {
        BankAccount ba = new BankAccount(500, 0, "name");
        double actualBalance = ba.withdraw(400);
        assertEquals(100, actualBalance);
    }

    @Test
    public void increaseBalance() {
        BankAccount ba = new BankAccount(0, 0, "name");
        double actualBalance = ba.deposit(-500);

        IllegalArgumentException exc = new IllegalArgumentException("Deposit balance cannot be negative");
        assertEquals(exc, actualBalance);
    }
}
