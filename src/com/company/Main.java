package com.company;

import com.company.Cylinder.Circle;
import com.company.Cylinder.Cylinder;
import com.company.Inherritance_challenge.Car;
import com.company.Rectangle.Cuboid;
import com.company.Rectangle.Rectangle;
import com.company.composition.*;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2209", "Sonic","240", dimensions);
        Resolution resolution = new Resolution(800, 600);
        Monitor monitor = new Monitor("2233", "Ultrapek", 24, resolution);
        Motherboard motherboard = new Motherboard("23PZT", "Asus", 4, 2, "alCapone");

        PC pc = new PC(theCase, monitor, motherboard);

        pc.getMonitor().drawPixelAt(2,5,"red");


    }
}

