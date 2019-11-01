package com.vita.stat;

public class Main {

    public int multiply = 7;

    public static void main(String[] args){
   /*     StaticClass firstInstance = new StaticClass("First instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());

        StaticClass secondInstance = new StaticClass("Second Instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());*/
    }

    public int multiply(int number){
        return number * multiply;
        //answer: the multiply must will be static
    }

}
