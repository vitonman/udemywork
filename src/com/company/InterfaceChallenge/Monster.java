package com.company.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    String name;
    int health;
    int strenght;

    public Monster(String name, int health, int strenght) {
        this.name = name;
        this.health = health;
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strenght=" + strenght +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();

        values.add(0, this.name);
        values.add(1, "" + this.health);
        values.add(2, "" + this.strenght);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if(savedValues != null && savedValues.size() > 0){

            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));


        } else {



        }

    }



}
