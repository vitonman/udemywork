package com.company.oop_final_challenge;

public class HealthyBurger extends BaseBurger {

    private String addition5;
    private String addition6;


    public HealthyBurger(String meat, int burgerCost) {
        super("Healthy burger","Brown rye bread roll", meat, burgerCost);
    }

    @Override
    public void printListadded() {
        super.printListadded();

        if(getAddition5() != null){

            System.out.println("Added " + getAddition5());

        }
        if(getAddition6() != null){

            System.out.println("Added " + getAddition6());

        }

    }

    @Override
    public void getBurgerTotal() {
        super.getBurgerTotal();

    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {

        addAdditionToCost();

        this.addition5 = addition5;

        System.out.println("You're added a " + addition5 + " now burger cost is: " + super.getTotal());


    }

    public String getAddition6() {
        return addition6;
    }

    public void setAddition6(String addition6) {

        addAdditionToCost();

        this.addition6 = addition6;

        System.out.println("You're added a " + addition6 + " now burger cost is: " + super.getTotal());
    }
}
