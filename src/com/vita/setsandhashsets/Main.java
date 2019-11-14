package com.vita.setsandhashsets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
       HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //MARS

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //MARS

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //Jupiter

        tempMoon = new Moon("Europa", 3.8);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //Jupiter

        tempMoon = new Moon("Gallisto", 16.7);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);


        System.out.println("Planets");
        for (HeavenlyBody planet: planets){
            System.out.println("\t" + planet.getKey().getName());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey().getName());
        for (HeavenlyBody marsmoons: body.getSatellites()){
            System.out.println("\t" + marsmoons.getKey().getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planets : planets){
            moons.addAll(planets.getSatellites());
        }
        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getKey().getName());
        }

        for (HeavenlyBody planet: planets){
            System.out.println(temp.getKey() + ": " + planet.getOrbintalPeriod());
        }
/*
        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));*/

    }
}
