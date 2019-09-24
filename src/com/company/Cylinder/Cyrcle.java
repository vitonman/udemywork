package com.company.Cylinder;

public class Cyrcle {

    private double radius;


    public Cyrcle(double radius) {

        if(radius < 0){

            this.radius = 0;

        }else{

            this.radius = radius;

        }
    }

    public double getRadius(){

        return this.radius;

    }


    public double getArea(){

        double radius = this.radius;

        return (radius * radius * Math.PI);

    }
}
