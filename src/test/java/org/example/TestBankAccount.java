package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBankAccount {

    @Test
    public void increaseBalance() {
        BankAccount ba = new BankAccount(0.00, 0.00, "name");
        double actualBalance = ba.deposit(400.00);
        assertEquals(400.00, actualBalance);
    }

    // tests if decrease balance
    @Test
    public void decreaseBalance() {
        BankAccount ba = new BankAccount(500.00, 0.00, "name");
        double actualBalance = ba.withdraw(400.00);
        assertEquals(100, actualBalance);
    }

    // tests if trying to add a negative deposit
//    @Test
//    public void negativeDeposit() {
//        BankAccount ba = new BankAccount(0.00, 0.00, "name");
//        double actualBalance = ba.deposit(-500.00);
//
//        IllegalArgumentException exc = new IllegalArgumentException("Deposit balance cannot be negative");
//        assertEquals(0.00, actualBalance);
//    }
}
