package spring.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music{
    List<String> classicalList = new ArrayList<>();

    public ClassicalMusic() {
        classicalList.add("Karmina Burana");
        classicalList.add("Ave mariya");
        classicalList.add("Moon sonata");
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("Initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destruction");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        int i = random.nextInt(3);
        String song = classicalList.get(i);
        return song;
    }
}
