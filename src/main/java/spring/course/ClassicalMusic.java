package spring.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    List<String> classicalList = new ArrayList<>();
    @Autowired
    public ClassicalMusic() {
        classicalList.add("Karmina Burana");
        classicalList.add("Ave mariya");
        classicalList.add("Moon sonata");
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        Random random = new Random();
        int i = random.nextInt(3);
        String song = classicalList.get(i);
        return song;
    }
}
