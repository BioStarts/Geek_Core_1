package com.geekbrains.participants;

public class Team {

    String tname;

    public Participant[] getArrayteam() {
        return Arrayteam;
    }

    public Participant[] Arrayteam;

    public Team(String tname, Participant[] Arrayteam){
            this.tname = tname;
            this.Arrayteam = Arrayteam;}


    public void showResults() {
        for (Participant o: Arrayteam) {
            if (!(Arrayteam.length == 4)){
                System.out.println("Количество участиников команды должно быть равно 4!");
                break;
            }
            if(o.isActive()) {
                System.out.println(o.getName() + " win");
            } else {
                System.out.println(o.getName() + " lose");
            }
        }
    }
}
