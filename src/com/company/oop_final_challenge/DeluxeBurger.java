package com.company.oop_final_challenge;

public class DeluxeBurger extends BaseBurger {
    public DeluxeBurger(String name, String bread, String meat, int burgerCost) {
        super(name, bread, meat, burgerCost);
        super.setAddition1("Chips");
        super.setAddition2("Drink");

    }

    @Override
    public void setAddition1(String addition1) {

        System.out.println("You can't add here additions");
    }

    @Override
    public void setAddition2(String addition2) {
        System.out.println("You can't add here additions");
    }

    @Override
    public void setAddition3(String addition3) {
        System.out.println("You can't add here additions");
    }

    @Override
    public void setAddition4(String addition4) {
        System.out.println("You can't add here additions");
    }
}
