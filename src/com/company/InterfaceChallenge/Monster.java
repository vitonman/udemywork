package com.company.InterfaceChallenge;

import java.util.ArrayList;

public class Monster implements ISaveable {

    int health;
    int damage;

    @Override
    public String toString() {
        return "Monster{" +
                "health=" + health +
                ", damage=" + damage +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        return null;
    }

    @Override
    public void read(ArrayList<String> savedValues) {

    }

}
