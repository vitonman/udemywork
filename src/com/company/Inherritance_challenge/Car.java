package com.company.Inherritance_challenge;

public class Car extends Vehicle{

    private int gear;

    public Car(String name, int steering, int speed) {
        super(name, steering, speed);
        this.gear = 0;
    }



    public void changeGear(int gear){

        if(gear > 5 || gear < 1){

            System.out.println("You can choose 1 to 5");

        } else {

            this.gear = gear;
            System.out.println("Gear changed = " + this.gear);

        }

    }

}
