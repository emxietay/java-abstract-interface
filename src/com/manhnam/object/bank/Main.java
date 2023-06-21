package com.manhnam.object.bank;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account();
        Account nam = new Account("Nam", 1000);
        acc.withdrawFunds(1000);
        acc.depositFunds(1000);
        acc.depositFunds(1000);
        acc.depositFunds(1000);
        acc.setAccountNumber(123456);
        acc.withdrawFunds(1100);
        acc.withdrawFunds(500);
        acc.withdrawFunds(500);
        acc.withdrawFunds(500);
    }
}
