package com.company;

public class SimpleCalculator{

    private double firstNumber;
    private double secondNumber;



    public void setFirstNumber(double value){

        firstNumber = value;

    }

    public void setSecondNumber(double value){


        secondNumber = value;

    }

    public double getFirstNumber(){

        return firstNumber;
    }

    public double getSecondNumber(){

        return secondNumber;
    }

    public double getAdditionResult(){

        double answer = getFirstNumber() + getSecondNumber();

        return answer;

    }

    public double getSubtractionResult(){

        return (getFirstNumber() - getSecondNumber());

    }

    public double getMultiplicationResult(){

        return (getFirstNumber() * getSecondNumber());

    }

    public double getDivisionResult(){

        if(getSecondNumber() == 0){
            return 0;
        }else{

            return (getFirstNumber() / getSecondNumber());

        }


    }


}
