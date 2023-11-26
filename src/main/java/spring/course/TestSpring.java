package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.font.NumericShaper;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.computerPlayMusic(Genres.ROCK));

        context.close();


        //Создание бинов из xml файла
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
        //System.out.println(classicalMusic.getSong());
        //ClassicalMusic classicalMusic1 = context.getBean("musicBean1", ClassicalMusic.class);
        //System.out.println(classicalMusic.getSong());
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparsion = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparsion);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
        //musicPlayer.playMusic();

        //System.out.println("Name: " + musicPlayer.getName());
        //System.out.println("Volume: " + musicPlayer.getVolume());
        context.close();
    }
}
