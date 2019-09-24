package com.company.other_challenges;

public class Wall {


    private double height;
    private double width;

    public Wall(){


    }

    public Wall(double width, double height){

        if(width < 0){

            this.width = 0;

        } else {

            this.width = width;

        }

        if(height < 0){

            this.height = 0;

        } else {

            this.height = height;

        }

    }

    public double getHeight(){

        return this.height;

    }

    public double getWidth(){

        return this.width;

    }

    public void setWidth(double value){

        if(value < 0){

            this.width = 0;

        } else {

            this.width = value;

        }

    }

    public void setHeight(double value){

        if(value < 0){

            this.height = 0;

        } else {

            this.height = value;

        }

    }

    public double getArea(){

        return this.height * this.width;

    }
}
