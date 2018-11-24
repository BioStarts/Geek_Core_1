package com.geekbrains.obstacles;

import com.geekbrains.participants.Animal;
import com.geekbrains.participants.Team;

public class Course {
    public Course(Obstacle[] course){
        this.course=course;
    }

    public Obstacle[] getCourse() {
        return course;
    }
    Obstacle[] course;
    public void start(Animal[] team) {
        for (Animal t: team
             ) {
            for (Obstacle o: course
                 ) {
                o.doIt(t);
                if(!t.isActive()) {
                    break;
                }
            }
        }
    }
}
