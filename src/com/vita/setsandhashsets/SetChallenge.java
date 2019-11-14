package com.vita.setsandhashsets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<String> planetType = new HashSet<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

/*
        HeavenlyBody temp = new HeavenlyBody("Earth","Exoplanet", 365);
        solarSystem.put(temp.getName(), temp);
        planetType.add(temp.getBodyType());
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon","Sattelite", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new HeavenlyBody("Beta-Galomor", "Exoplanet", 70);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Beta-Galomor", "Ectoplanet", 70);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        System.out.println("========================>");

        System.out.println("Planets");
        //printSet(planets);

        System.out.println("========================>");

        for (HeavenlyBody planet : planets){
            System.out.println(planet);
        }*/


     /*   System.out.println("========================");
        HeavenlyBody body = solarSystem.get("Earth");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody sattelite: body.getSatellites()){
            System.out.println("\t" + sattelite.getName() + ", type: " + sattelite.getBodyType());
        }*/
    }



    /*private static void printSet(Set<HeavenlyBody> set){
        System.out.println("\t");

        HeavenlyBody curr = null;
        for (HeavenlyBody s : set){
            if(curr != null){
                if(!(s.equals(curr))){
                    System.out.println(curr.getName() + ": " + curr.getBodyType());
                }
            }
            curr = s;
            System.out.println(s.getName() + ": " + s.getBodyType());



        }
        System.out.println();
    }*/
}
