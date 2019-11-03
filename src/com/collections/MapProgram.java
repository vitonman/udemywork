package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")){
            System.out.println("Java already in the map");
        }else{
            languages.put("Java", "this course is about...");
        }

        languages.put("Python", "an interpteted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginner All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")){
            System.out.println("Java already in the map");
        }else{
            languages.put("Java", "this course is about...");
        }

        System.out.println("===========================================================================");

        //languages.remove("Lisp");

        if (languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "This will not work", "a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        //System.out.println(languages.replace("Scala", "this will not be added"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }


    }

}
