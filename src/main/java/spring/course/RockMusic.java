package spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music {
    List<String> rockList = new ArrayList<>();

    public RockMusic() {
        rockList.add("Smells like teen spirit");
        rockList.add("I hate everything about you");
        rockList.add("In the end");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        int i = random.nextInt(3);
        String song = rockList.get(i);
        return song;
    }
}
