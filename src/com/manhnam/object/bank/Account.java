package com.manhnam.object.bank;

public class Account {
    private static int depositTracker = 0;
    private static int withdrawTracker = 0;
    private long accountNumber;
    private String name;
    private double balance;
    private String email;
    private String phoneNumber;

    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        balance += amount;
        depositTracker++;
        System.out.printf("-%3d times to deposit, the remaining balance is: %10.2f%n", depositTracker, balance);

    }

    public void withdrawFunds(double amount) {
        if (balance > amount) {
            withdrawTracker++;
            balance -= amount;
            System.out.printf("-%3d times to withdraw, the remaining balance is: %9.2f%n", withdrawTracker, balance);
        } else {
            System.out.println("The withdrawal cannot processed due to insufficient balance - " + balance);
        }
    }
}
