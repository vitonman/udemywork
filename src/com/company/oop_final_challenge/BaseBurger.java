package com.company.oop_final_challenge;

public class BaseBurger {

    private String name;
    private String breadType;
    private String meat;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private double baseBurgerCost;
    private double additionPrice;
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }



    public void setBaseBurgerCost(int baseBurgerCost) {
        this.baseBurgerCost = baseBurgerCost;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    public void setAdditionPrice(int additionPrice) {
        this.additionPrice = additionPrice;
    }

    public BaseBurger(String name, String bread, String meat, int burgerCost) {
        this.name = name;
        this.breadType = bread;
        this.meat = meat;
        this.baseBurgerCost = burgerCost;
        this.additionPrice = 0.10;
        this.total = burgerCost;

        System.out.println(this.name + " burger: " + this.baseBurgerCost + "$ with : " + this.breadType + " and " +
                this.meat + ".");
    }

    public void printListadded(){

        if(getAddition1() != null){

            System.out.println("Added " + getAddition1());

        }
        if(getAddition2() != null){

            System.out.println("Added " + getAddition2());

        }
        if(getAddition3() != null){

            System.out.println("Added " + getAddition3());

        }
        if(getAddition4() != null){

            System.out.println("Added " + getAddition4());

        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void getBurgerTotal(){

        printListadded();

        System.out.println("Total:  " + this.name + " burger: " + this.total + "$ with : " + this.breadType + " and " +
                this.meat + ".");

    }

    public void addAdditionToCost(){

        this.total += this.additionPrice;

    }

    //additions.

    public void setAddition1(String addition1) {
        addAdditionToCost();
        this.addition1 = addition1;
        System.out.println("You're added a " + addition1 + " now burger cost is: " + this.total);

    }

    public void setAddition2(String addition2) {
        addAdditionToCost();
        this.addition2 = addition2;
        System.out.println("You're added a " + addition2 + " now burger cost is: " + this.total);
    }

    public void setAddition3(String addition3) {
        addAdditionToCost();
        this.addition3 = addition3;
        System.out.println("You're added a " + addition3 + " now burger cost is: " + this.total);
    }

    public void setAddition4(String addition4) {
        addAdditionToCost();
        this.addition4 = addition4;
        System.out.println("You're added a " + addition4 + " now burger cost is: " + this.total);
    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public String getAddition3() {

        return addition3;

    }

    public String getAddition4() {
        return addition4;
    }
}
