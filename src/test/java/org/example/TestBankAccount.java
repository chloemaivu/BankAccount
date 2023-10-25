package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount {

    //tests depositing positive amount
    @Test
    public void increaseBalance() {
        BankAccount ba = new BankAccount(0.00, 0.00, "Kim");
        double actualBalance = ba.deposit(400.00);
        assertEquals(400.00, actualBalance);
    }

    // tests withdrawals
    @Test
    public void decreaseBalance() {
        BankAccount ba = new BankAccount(500.00, 0.00, "Kim");
        double actualBalance = ba.withdraw(400.00);
        assertEquals(100, actualBalance);
    }

    //     tests adding a negative deposit
    @Test
    public void negativeDepositShouldThrowError() {
        BankAccount ba = new BankAccount(0, 0, "John Doe");

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> ba.deposit(-100));

        assertTrue(thrown.getMessage().contains("Deposit cannot be negative"));
    }
}
