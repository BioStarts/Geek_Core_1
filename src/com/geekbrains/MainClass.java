package com.geekbrains;

import com.geekbrains.participants.*;
import com.geekbrains.obstacles.*;

public class MainClass {
    public static void main(String[] args) {
        Participant[] participants = {new Human("Bob"), new Cat("Barsik"), new Dog("Bobik")};
        Obstacle[] obstacles = {new Cross(200), new Water(20), new Wall(2), new Cross(500)};
        for(Participant p : participants) {
            for(Obstacle o : obstacles) {
                o.doIt(p);
                if(!p.isActive()) {
                    break;
                }
            }
        }
        for(Participant p : participants) {
            if(p.isActive()) {
                System.out.println(p.getName() + " win");
            } else {
                System.out.println(p.getName() + " lose");
            }
        }
        System.out.println("------------------Course------------------------");
        Course c = new Course(new Obstacle[]{new Cross(50),new Wall(50),new Water(50)});
        c.start(team1);


        System.out.println("--------------------Team----------------------");

        Team team1 = new Team(new Animal[]{new Cat("Кот1"),new Cat("Кот2"), new Dog("Пес1"), new Dog("Пес2")});
        team1.showResults();


    }
}
