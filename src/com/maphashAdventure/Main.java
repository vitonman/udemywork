package com.maphashAdventure;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("West", 2);
        tempExit.put("East", 3);
        tempExit.put("South", 4);
        tempExit.put("North", 5);
        locations.put(1, new Location(1, "You are sranding at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("North", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("West", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("North", 1);
        tempExit.put("West", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("South", 1);
        tempExit.put("West", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        //VOCABULARY
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("NORTH", "N");


        int loc = 1;
        while (true){
            String[] directionExits;
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");

            int counter = 0;
            for (String exit: exits.keySet()){
                counter++;
                if((exits.keySet().size()) == counter){
                    System.out.print(exit + ".");
                    System.out.println();
                }else{
                    System.out.print(exit + ", ");
                }
            }
            String [] directions = scanner.nextLine().split(" ");
            for (String direction: directions){
                //go to west
                if(vocabulary.containsValue(direction.toUpperCase()) || vocabulary.keySet().contains(direction.toUpperCase())){
                    for (String exit: exits.keySet()){
                        if (vocabulary.keySet().contains(exit.toUpperCase())){
                            loc = exits.get(exit);
                        }
                    }
                }else{
                    System.out.println("no match");
                }


            }

    }

        /*int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word: words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);

            } else {
                System.out.println("You cannot go in that direction");
            }
        }*/


    }
}
