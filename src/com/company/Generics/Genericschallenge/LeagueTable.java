package com.company.Generics.Genericschallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeagueTable<T extends Team> {

    public String name;
    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addteam(T team){

        if(teams.contains(team)){

            System.out.println(team.getName() + " is already on this league");
            return false;

        } else {

            teams.add(team);
            System.out.println(team.getName() + " picked league " + this.name);
            return true;
        }
    }

    public void showLeaguetable(){


    }
}
