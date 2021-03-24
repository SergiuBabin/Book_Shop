package md.Sergiu.SpringApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Babin Sergiu
 * @created 06/03/2021 - 21:21
 * @project Book_Shop
 */
enum nusic{CLASSICAL, ROCK}
public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
//        JazzMusic jazzMusic = context.getBean("musicBean2", JazzMusic.class);
//
//        Music music = context.getBean("musicBean2", JazzMusic.class);
//
//        Music music1 = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(jazzMusic.getSong());
//        System.out.println(music.getSong());
//        System.out.println(classicalMusic.getSong());
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
          MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic(nusic.CLASSICAL));
        System.out.println(musicPlayer.playMusic(nusic.ROCK));
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
//
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic2==classicalMusic1);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(musicPlayer == musicPlayer1);
//
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer1);
//
//        musicPlayer.setVolume(10);
//
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName() + "\n"+ musicPlayer.getVolume());
//        System.out.println(musicPlayer1.getName() + "\n"+ musicPlayer1.getVolume());
        //Computer computer = context.getBean("computer", Computer.class);

        //System.out.println(computer);
        context.close();
    }
}
