package com.company.composition;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    //FOR MAIN
    /*
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2209", "Sonic","240", dimensions);
        Resolution resolution = new Resolution(800, 600);
        Monitor monitor = new Monitor("2233", "Ultrapek", 24, resolution);
        Motherboard motherboard = new Motherboard("23PZT", "Asus", 4, 2, "alCapone");

        PC pc = new PC(theCase, monitor, motherboard);

        pc.getTheCase().pressPowerButton();
        pc.getMotherboard().loadProgress("windows LT");
        pc.getMonitor().drawPixelAt(2,5,"red");
*/
    /*   Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2209", "Sonic","240", dimensions);
        Resolution resolution = new Resolution(800, 600);
        Monitor monitor = new Monitor("2233", "Ultrapek", 24, resolution);
        Motherboard motherboard = new Motherboard("23PZT", "Asus", 4, 2, "alCapone");

        PC thePC = new PC(theCase,monitor,motherboard);

        thePC.powerUp();*/
    //FOR MAIN

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){

        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){

        monitor.drawPixelAt(2,3,"red");

    }

}
