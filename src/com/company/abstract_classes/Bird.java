package com.company.abstract_classes;

public abstract class Bird extends Animal implements ICanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {

        System.out.println(getName() + " is eating");

    }

    @Override
    public void breathe() {

        System.out.println(getName() + " is breathing");

    }

    @Override
    public void fly() {
        System.out.println("Flapping");
    }
}
