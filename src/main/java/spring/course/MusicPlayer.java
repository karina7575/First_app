package spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music rock;
    private Music classica;

@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rock,
                       @Qualifier("classicalMusic") Music classica) {
        this.rock = rock;
        this.classica = classica;
    }

    public String playMusic(Genres genre) {
        switch (genre){
            case ROCK :
            return "Playing " + rock.getSong();
            case CLASSICAL:
            return "Playing " + classica.getSong();
        }
        return "No songs";
    }

    }

