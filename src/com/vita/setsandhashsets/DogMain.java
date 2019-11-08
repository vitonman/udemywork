package com.vita.setsandhashsets;

public class DogMain {

    public static void main(String[] args) {
        Labrador labrador = new Labrador("Rover");
        Dog labrador2 = new Dog("Rover");

        System.out.println(labrador2.equals(labrador));
        System.out.println(labrador.equals(labrador2));
    }

}
