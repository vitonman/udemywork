package com.vita.vita.bankaccount;

import java.util.ArrayList;

public class BankAccount {

    private String accountName;
    private int balance;
    private ArrayList<Integer> transactions;


    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int ammount){

        if(ammount > 0){
            transactions.add(ammount);
            this.balance += ammount;
            System.out.println(ammount + " deposited. Balance now is " + this.balance);
        }else{
            System.out.println("Cannot deposit negative number.");
        }
    }

    public void withdraw(int amount){
        int withdraw = -amount;
        if(withdraw < 0){
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + " withdraw. Balance is now " + this.balance);
        }else{
            System.out.println("Cannot draw negative sums.");
        }
    }

    public void calculateBalance(){
        int balance = 0;
        for (int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculatet balance is " + this.balance);
    }
}
