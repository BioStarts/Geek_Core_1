package com.geekbrains.participants;

public class Team {
    String tname = "звери";
    public Team(Animal[] team){
        this.team = team; }
        Animal[] team;
    public void showResults() {
        for (Participant o: team) {
            if(o.isActive()) {
                System.out.println(o.getName() + " win");
            } else {
                System.out.println(o.getName() + " lose");
            }
        }
    }
}
