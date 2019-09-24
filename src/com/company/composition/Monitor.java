package com.company.composition;

public class Monitor {

    private String model;
    private String manifacture;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manifacture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manifacture = manifacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){

        System.out.println("Drawing pixel at " + x + ", " + y + " in color -> " + color + ".");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManifacture() {
        return manifacture;
    }

    public void setManifacture(String manifacture) {
        this.manifacture = manifacture;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void setNativeResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }
}
