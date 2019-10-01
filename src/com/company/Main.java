package com.company;


import com.company.ArrayListChallenge.MobilePhone;
import com.company.GroceryArrayList.GroceryList;

public class Main {

    public static void main(String[] args) {


        MobilePhone mobilePhone = new MobilePhone();


        mobilePhone.addContact("Vitali", 3222312);
        mobilePhone.addContact("Sergei", 23231);
        mobilePhone.printContactList();

        mobilePhone.findItem("KEKE");

        mobilePhone.removeContactItem("Vitali");

        mobilePhone.printContactList();

        mobilePhone.modifyContactItem("Sergei", "Peekar", 23232323);
        mobilePhone.printContactList();


    }
}

