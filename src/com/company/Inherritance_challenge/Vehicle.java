package com.company.Inherritance_challenge;

public class Vehicle {

    private String name;
    private int steering;
    private int speed;

    public Vehicle(){
        //empty constructor
        new Vehicle("none",0,0);

    }

    public Vehicle(String name, int steering, int speed){

        this.name = name;
        this.steering = steering;
        this.speed = speed;

    }


    public void move(){

        this.speed = 1;

        System.out.println("The Vehicle:" + this.name + " was moving, speed = " + this.speed);



    }

    public void speedUp(){

        if(this.speed < 0 || this.speed == 0){

            move();

        } else {

            this.speed += 1;
            System.out.println("The Vehicle:" + this.name + " getting speed = " + this.speed);

        }

    }

    public void brake(){

        if(this.speed == 0 || this.speed < 0){

            System.out.println("Vehicle not moving");

        } else {

            this.speed = 0;
            System.out.println("You stoped the vegicle: " + this.name + ", speed is now : " + this.speed);

        }

    }

}
