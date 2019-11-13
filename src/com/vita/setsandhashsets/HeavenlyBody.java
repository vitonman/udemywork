package com.vita.setsandhashsets;

import com.company.oop_final_challenge.HealthyBurger;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbintalPeriod;
    private final BodyTypes bodyTypes;
    private final Set<HeavenlyBody> satellites;

/*    public static final int STAR = 1;
    public static final int PLANET = 2;
    public static final int DWARF_PLANET = 3;
    public static final int MOON = 4;
    public static final int COMET = 5;
    public static final int ASTEROID = 6;*/

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }


    public HeavenlyBody(String name, BodyTypes bodyType, double orbintalPeriod) {

        this.name = name;
        this.orbintalPeriod = orbintalPeriod;
        this.satellites = new HashSet<>();
        this.bodyTypes = bodyType;
    }

    public BodyTypes getBodyType(){
        return bodyTypes;
    }

    public String getName() {
        return name;
    }

    public double getOrbintalPeriod() {
        return orbintalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof HeavenlyBody){
          HeavenlyBody theObject = (HeavenlyBody) obj;
          if(this.name.equals(theObject.getName())){
              return this.bodyTypes == theObject.getBodyType();
          }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyTypes + ", " + this.orbintalPeriod;
    }
}
