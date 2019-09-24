package com.company;

import com.company.Inherritance_challenge.Car;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Car car = new Car("basic", 1, 1);

        car.move();
        car.brake();
        car.move();
        car.speedUp();
        car.changeGear(3);
        car.speedUp();


/*
        Carpet carpet = new Carpet(3.5); //carpet cost.
        Floor floor = new Floor(2.75, 4.0); //check area, creating floor.
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost())

 */

/*
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
 */



    /*        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(7.25, 4.3, 2.35);
        getBucketCount(6.26, 2.2);/*


   /*  Wall wall = new Wall(20, 20);


    */

    //-----------------------------------
        /*
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println(first.distance(second));

   //------------------------------------

  /*  SimpleCalculator calculator = new SimpleCalculator();

    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println("add= " + calculator.getAdditionResult());
    System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

 /*

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(3325233);
        bankAccount.setBalance(555.33);
        bankAccount.depositFunds(300);
        bankAccount.setCustomerName("Vitali");
        bankAccount.setEmail("vitalimaksimov@gmail.com");
        bankAccount.setPhone("+3725555555");

        bankAccount.withdrawFunds(600);
        System.out.println(bankAccount.getEmail());*/

    }





    public static int getBucketCount(double width,
                                     double height,
                                     double areaPerBucket,
                                     int extraBuckets){

        int buckets_needs;

        if(width <= 0 || height<=0 || areaPerBucket<= 0 || extraBuckets < 0){

            return -1;

        } else {

            double wall_area = width * height;

            //how many need buckets in double
            double many_of_buckets = wall_area / areaPerBucket;
            buckets_needs = (int) Math.ceil(many_of_buckets);

            if (buckets_needs >= extraBuckets){

                int answer;

                answer = buckets_needs - extraBuckets;

                System.out.println(answer);

                return answer;

            } else {

                return 0;

            }

        }


    }

    public static int getBucketCount(double width,
                                     double height,
                                     double areaPerBucket){

        int buckets_needs;

        if(width <= 0 || height<=0 || areaPerBucket<= 0){

            return -1;

        } else {
            int answer;

            double wall_area = width * height;

            //how many need buckets in double
            double many_of_buckets = wall_area / areaPerBucket;
            buckets_needs = (int) Math.ceil(many_of_buckets);



            answer = buckets_needs;

            System.out.println(buckets_needs);

            return answer;

        }


    }

    public static int getBucketCount(double area,
                                     double areaPerBucket){

        int buckets_needs;

        if(area <= 0 || areaPerBucket <= 0){

            return -1;

        } else {


            if(area >= areaPerBucket){

                int answer;

                double many_of_buckets = area / areaPerBucket;

                buckets_needs = (int) Math.ceil(many_of_buckets);

                answer = buckets_needs;

                System.out.println(buckets_needs);

                return answer;
            }



        }

        return 0;

    }





}

