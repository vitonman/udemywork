package com.company.Cylinder;

public class Circle {
/*

    Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
    Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
*/

    private double radius;


    public Circle(double radius) {

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
