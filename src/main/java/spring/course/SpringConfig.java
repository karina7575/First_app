package spring.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("spring.course")
@PropertySource("classpath:musicPlayer.properties")   //файл с параметрами volume и name
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }
    @Bean
    public List<Music> genreList(){
        List<Music> genreList = new ArrayList<>();
        genreList.add(new RockMusic());
        genreList.add(new PopMusic());
        genreList.add(new ClassicalMusic());
        return genreList;
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(genreList());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }


}
