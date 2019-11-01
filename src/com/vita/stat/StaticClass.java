package com.vita.stat;

public class StaticClass {
    private int numInstances = 0;
    private String name;

    public StaticClass(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances()  {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
