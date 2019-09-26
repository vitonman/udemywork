package com.company;

import com.company.Encaptulation.Player;
import com.company.house_challenge.Chair;
import com.company.house_challenge.House;
import com.company.house_challenge.Room;
import com.company.house_challenge.Table;


public class Main {

    public static void main(String[] args) {


        Player player = new Player();

        player.health = 100;
        player.name = "Vitali";
        player.weapon = "Gun";

        int damage = 8;
        player.loseHealth(damage);

        System.out.println("Remaining health:  " + player.healthRemaining());

        damage = 11;


    }
}

