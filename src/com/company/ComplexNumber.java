package com.company;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber (double real, double imaginary){

        this.real = real;
        this.imaginary = imaginary;

    }

    //add <-> subtract
    // (a + bi) ± (c + di) = (a ± c) + (b ± d)i,

    public double getReal(){

        return this.real;

    }

    public double getImaginary(){

        return this.imaginary;

    }

    public void add(double real, double imaginary){

        //add
        this.real += real;
        this.imaginary += imaginary;


    }

    public void add(ComplexNumber number){

        this.real += number.real;
        this.imaginary += number.imaginary;

    }

    public void subtract(double real, double imaginary){

        //subtract
        this.real -= real;
        this.imaginary -= imaginary;


    }

    public void subtract(ComplexNumber number){

        //subtract
        this.real -= number.real;
        this.imaginary -= number.imaginary;


    }


}
