package com.vita.vita.bankaccount;

public class Main {

    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount("VitaAccount");
        bankAccount.deposit(2000);
        bankAccount.withdraw(500);
        bankAccount.withdraw(-500);
        bankAccount.deposit(1000);
        bankAccount.calculateBalance();

        //bankAccount.balance = 500;

        System.out.println("Balance on account is " + bankAccount.getBalance()) ;

    }

}
