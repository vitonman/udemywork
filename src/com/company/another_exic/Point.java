package com.company.another_exic;


public class Point {


    private int x;
    private int y;

    public Point(){

    }


    public Point(int x, int y){

        this.x = x;
        this.y = y;

    }


    public int getX(){

        return this.x;

    }

    public int getY(){

        return this.y;
    }

    public void setX(int value){

        this.x = value;

    }

    public void setY(int value){

        this.y = value;

    }

    public double distance(){

        double distance;

        distance = Math.sqrt((0 - getX()) * (0-getX()) + (0 - getY()) *(0 - getY()));

        return distance;

    }

    public double distance(int x, int y){

        double distance;

        distance = Math.sqrt((x - getX()) * (x-getX())
                + (y - getY()) *(y - getY()));

        return distance;

    }

    public double distance(Point point){

        double distance;

        distance = Math.sqrt((point.getX() - getX()) * (point.getX()-getX())
                + (point.getY() - getY()) *(point.getY() - getY()));

        return distance;

    }


}
