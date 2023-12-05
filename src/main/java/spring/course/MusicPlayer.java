package spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    //private Music rock;
    //private Music classica;

    public List<Music> genreList = new ArrayList<>();

    public MusicPlayer(List <Music> genreList){
        this.genreList = genreList;
    }


//    public MusicPlayer(@Qualifier("rockMusic") Music rock,
//                       @Qualifier("classicalMusic") Music classica) {
//        this.rock = rock;
//        this.classica = classica;
//    }

    public String playMusic() {
        Random random = new Random();
        int i = random.nextInt(3);
        if(i == 0) {
            return genreList.get(i).getSong();
        }
        else if(i == 1){
            return genreList.get(i).getSong();
        }
        else {
            return genreList.get(i).getSong() ;
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}

