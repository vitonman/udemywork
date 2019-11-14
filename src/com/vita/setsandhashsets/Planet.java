package com.vita.setsandhashsets;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbintalPeriod) {
        super(name, BodyTypes.PLANET, orbintalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyTypes() == BodyTypes.MOON){
            return super.addSatellite(moon);
        }else{
            return false;
        }
    }
}
