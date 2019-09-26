package com.company;
import com.company.oop_final_challenge.BaseBurger;
import com.company.oop_final_challenge.HealthyBurger;


public class Main {

    public static void main(String[] args) {


        BaseBurger burger = new BaseBurger("white bread", "pork", 3);
        burger.setAddition1("Tomato");
        burger.setAddition2("Onion");
        burger.getBurgerTotal();


        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 3);

        healthyBurger.setAddition6("Onion");
        healthyBurger.getBurgerTotal();



    }
}

