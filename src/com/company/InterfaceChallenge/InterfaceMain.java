package com.company.InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceMain {

    public static void main(String[] args) {


        //here code.
        Monster monster = new Monster("Galaxtus", 30000, 40000);

        Monster monster2 = new Monster("Galaxtus", 30000, 40000);

        saveObject(monster);

        readValues();





    }


    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit){

            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;

            }

        }
        return values;
    }


    public static void saveObject (ISaveable objectToSave){

        for (int i = 0; i < objectToSave.write().size(); i++) {

            System.out.println("Saving " + objectToSave.write().get(i));
        }

    }

    public static void loadObject(ISaveable objectToLoad){

        ArrayList<String> values = readValues();

        objectToLoad.read(values);

    }

}
