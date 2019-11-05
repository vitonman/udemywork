package com.maphashAdventure;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are sranding at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("West", 2);
        locations.get(1).addExit("East", 3);
        locations.get(1).addExit("South", 4);
        locations.get(1).addExit("North", 5);

        locations.get(2).addExit("North", 5);

        locations.get(3).addExit("West", 1);

        locations.get(4).addExit("North", 1);
        locations.get(4).addExit("West", 2);

        locations.get(5).addExit("South", 1);
        locations.get(5).addExit("West", 2);


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
       /* String[] road = "You are standing at the end of a road before a small building".split(" ");
        for (String i : road){
            System.out.println(i);
        }*/


       /* String[] building = " You are inside a building, a well house for a small spring".split(", ");
        for(String i:building){
            System.out.println(i);
        }*/
    }

    }
}
