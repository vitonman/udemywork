package com.company.Generics.Genericschallenge;

public class genericMain {

    //ArrayList<Team> teams;
    // Collections.sort(teams);

    public static void main(String[] args){


        Team vitaTeam = new Team("aloha");
        Team keniteam = new Team("privateam");

        LeagueTable leaguetable = new LeagueTable("Sporticus");

        leaguetable.addteam(vitaTeam);
        leaguetable.addteam(keniteam);

        leaguetable.addteam(vitaTeam);




    }




}
