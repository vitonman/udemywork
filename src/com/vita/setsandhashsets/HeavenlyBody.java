package com.vita.setsandhashsets;


import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbintalPeriod;
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

        this.key = new Key(name, bodyType);

        this.orbintalPeriod = orbintalPeriod;
        this.satellites = new HashSet<>();
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
          return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }



    public Key getKey() {
        return key;
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyTypes + ", " + this.orbintalPeriod;
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyTypes;

        private Key(String name, BodyTypes bodyTypes){
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())){
                return(this.name.equals(key.getName()));
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyTypes;
        }
    }
}
