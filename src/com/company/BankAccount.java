package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount(){

        System.out.println("Empty construction called");

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositFunds(double funds){

        balance += funds;

    }

    public void withdrawFunds(double funds){

        if(getBalance() < funds){

            System.out.println("You can't withdraw " + funds + ", " +
                    "you have only " + getBalance() + " balance.");

        } else {

            balance -= funds;//
            System.out.println("Now your balance is: " + getBalance());

        }


    }
}
