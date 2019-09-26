package com.company;
import com.company.oop_final_challenge.BaseBurger;
import com.company.oop_final_challenge.DeluxeBurger;
import com.company.oop_final_challenge.HealthyBurger;


public class Main {

    public static void main(String[] args) {


        BaseBurger burger = new BaseBurger("Royal with cheese","white bread", "pork", 3);
        burger.setAddition1("Tomato");
        burger.setAddition3("Onion");
        burger.getBurgerTotal();

        System.out.println("*******************************************");
        System.out.println("*******************************************");


        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5);
        healthyBurger.setAddition6("Onion");
        healthyBurger.setAddition3("Tomato");
        healthyBurger.setAddition5("Cheese");
        healthyBurger.getBurgerTotal();

        System.out.println("*******************************************");
        System.out.println("*******************************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe burger", "White bred", "Stake", 4);
        deluxeBurger.setAddition3("royal");

        deluxeBurger.getBurgerTotal();


    }
}

