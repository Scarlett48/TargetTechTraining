package com.aique.generics;

public class TestMain {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> bengalTigers = new Team<>("Bengal Tigers");
        bengalTigers.addPlayer(joe);
//        bengalTigers.addPlayer(pat);
//        bengalTigers.addPlayer(beckham);

        System.out.println(bengalTigers.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(bengalTigers, 3, 8);

        bengalTigers.matchResult(fremantle, 2, 1);
//        bengalTigers.matchResult(baseballTeam, 1, 1);
    }
}
