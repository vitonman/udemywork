package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
	// write your code he

    /*        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(7.25, 4.3, 2.35);
        getBucketCount(6.26, 2.2);*/




    SimpleCalculator calculator = new SimpleCalculator();

    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println("add= " + calculator.getAdditionResult());
    System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionReslt());



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

