package com.company.oop_final_challenge;

public class HealthyBurger extends BaseBurger {

    private String addition5;
    private String addition6;
    private double total;

    @Override
    public void setBaseBurgerCost(int baseBurgerCost) {
        super.setBaseBurgerCost(baseBurgerCost);
    }

    @Override
    public double getAdditionPrice() {
        return super.getAdditionPrice();
    }

    @Override
    public void setAdditionPrice(int additionPrice) {
        super.setAdditionPrice(additionPrice);
    }

    public HealthyBurger(String meat, int burgerCost) {
        super("Brown rye bread roll", meat, burgerCost);
        this.total = burgerCost;
    }

    @Override
    public void getBurgerTotal() {
        super.getBurgerTotal();


        if(getAddition5() != null){

            System.out.println("Added " + getAddition5());

        }
        if(getAddition6() != null){

            System.out.println("Added " + getAddition6());

        }

    }

    @Override
    public void setAddition1(String addition1) {
        super.setAddition1(addition1);
    }

    @Override
    public void setAddition2(String addition2) {
        super.setAddition2(addition2);
    }

    @Override
    public void setAddition3(String addition3) {
        super.setAddition3(addition3);
    }

    @Override
    public void setAddition4(String addition4) {
        super.setAddition4(addition4);
    }

    @Override
    public String getAddition1() {
        return super.getAddition1();
    }

    @Override
    public String getAddition2() {
        return super.getAddition2();
    }

    @Override
    public String getAddition3() {
        return super.getAddition3();
    }

    @Override
    public String getAddition4() {
        return super.getAddition4();
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {

        this.addition5 = addition5;

        super.setTotal(this.total+=getAdditionPrice());

        System.out.println("You're added a " + addition5 + " now burger cost is: " + getTotal());


    }

    public String getAddition6() {
        return addition6;
    }

    public void setAddition6(String addition6) {

        this.addition6 = addition6;

        super.setTotal(this.total+=getAdditionPrice());

        System.out.println("You're added a " + addition6 + " now burger cost is: " + getTotal());
    }
}
