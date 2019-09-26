package com.company.Encaptulation;

public class Player {

    //суть в том что нельзя давать доступ напрямую к  main. нужно изпользовать конструктор.

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){

        this.health = this.health - damage;

        if(this.health <= 0){

            System.out.println("Player knocked down");
            //Reduce number of lives ramaining for the player

        }

    }

    public int healthRemaining(){

        return this.health;

    }

}
