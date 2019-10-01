package com.company.ArrayChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayChallenge {

    private Scanner scanner = new Scanner(System.in);



    public void startProgram(){

        System.out.println("Starting array challenge program . . . ");
        System.out.println("Please enter how many numbers you want to add.");

        int[] values = getIntegers(scanner.nextInt());



        printArray(values);

        int[] new_array = sortIntegers(values);

        printArray(new_array);


        System.out.println("Done.");


    }


    public int[] getIntegers(int number){

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {

            System.out.println("Enter number:");

            values[i] = scanner.nextInt();

        }

        return values;

    }

    public void printArray(int[] array){

        System.out.println("Your array: ");

        for (int i = 0; i < array.length; i++) {



            if((array.length - i) == 1){

                System.out.print(array[i] + ".");

            } else {

                System.out.print(array[i] + ", ");

            }

        }



    }

    public int[] sortIntegers(int[] array){

        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            sortedArray[i] = array[i];

        }

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {

                if(sortedArray[i] < sortedArray[i+1]){

                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }

            }

        }


        return sortedArray;

    }

}
