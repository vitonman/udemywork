package com.company.Generics;



public class main {

    public static void main(String[] args){

        FootballPlayer vita = new FootballPlayer("Vita");
        SoccerPlayer kita = new SoccerPlayer("Kita");
        BaseballPlayer keni = new BaseballPlayer("Keni");

        Team<FootballPlayer> tartubulls = new Team<>("Tartu Bull's");
        tartubulls.addPlayer(vita);
        /*tartubulls.addPlayer(kita);
        tartubulls.addPlayer(keni);*/

        System.out.println(tartubulls.numPlayer());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Tallinna Mehed");
        baseballPlayerTeam.addPlayer(keni);

        Team<SoccerPlayer> brokenTeam = new Team<>("this not work");
        brokenTeam.addPlayer(kita);

        Team<FootballPlayer> anotherTeam = new Team<>("Another Team");
        FootballPlayer banks = new FootballPlayer("Yuri");
        anotherTeam.addPlayer(banks);

        Team<FootballPlayer> hawstone = new Team<>("Hawstone");
        Team<FootballPlayer> downstone = new Team<>("Downstone");

        hawstone.matchResult(downstone, 1, 2);
        hawstone.matchResult(anotherTeam, 2,3);


        System.out.println("Rankings");
        System.out.println(hawstone.getName() + ": " + hawstone.ranking());
        System.out.println(downstone.getName() + ": " + downstone.ranking());
        System.out.println(anotherTeam.getName() + ": " + anotherTeam.ranking());

        System.out.println(hawstone.compareTo(downstone));

    }



}
