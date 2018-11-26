package com.geekbrains.obstacles;
import com.geekbrains.participants.Participant;
import com.geekbrains.participants.Team;

public class Course {

    Obstacle Arraycourse[] = {new Cross(50),new Wall(50),new Water(50)};

    public void start(Team t) {
        for (Participant p: t.Arrayteam
             ) {
            if (!(t.Arrayteam.length == 4)){
                System.out.println("Количество участиников команды должно быть равно 4!");
                break;
            }
            for (Obstacle o: Arraycourse
                 ) {
                o.doIt(p);
                if(!p.isActive()) {
                    break;
                }
            }
        }
    }
}
