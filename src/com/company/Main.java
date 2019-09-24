package com.company;

import com.company.Cylinder.Circle;
import com.company.Cylinder.Cylinder;
import com.company.Inherritance_challenge.Car;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());



    }
}

