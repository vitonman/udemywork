package com.company;


import com.company.GroceryArrayList.GroceryList;

public class Main {

    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();

        groceryList.addGroceryItem("Milk");
        groceryList.addGroceryItem("Bread");
        System.out.println(groceryList.getGroceryList());

        groceryList.modifyGroceryItem("Milk", "Kefir");

        System.out.println(groceryList.getGroceryList());

        groceryList.printGroceryList();
        groceryList.onFile("Milk");

    }
}

