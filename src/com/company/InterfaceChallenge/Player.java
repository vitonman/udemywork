package com.company.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    int damage;
    int health;

    public Player(int health) {

        this.health = health;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public ArrayList<String> write() {
        return null;
    }

    @Override
    public void read(List<String> savedValues) {

    }


}
