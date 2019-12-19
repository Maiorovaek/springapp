package ru.mayorova.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music classicalMusic = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(classicalMusic);
//        musicPlayer2.playMusic();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
