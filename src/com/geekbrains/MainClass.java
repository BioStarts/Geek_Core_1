package com.geekbrains;

import com.geekbrains.participants.*;
import com.geekbrains.obstacles.*;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("--------------------Team----------------------");

        Team team1 = new Team("Cool", new Participant[]{new Cat("Кот1"),new Cat("Кот2"), new Dog("Пес2"), new Human("Masha")});
        Course c = new Course();
        c.start(team1);

        System.out.println("--------------------Final results----------------------");
        team1.showResults();

    }
}
