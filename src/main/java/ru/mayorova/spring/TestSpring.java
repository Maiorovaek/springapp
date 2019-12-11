package ru.mayorova.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
               "applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

    //    Music music = context.getBean("musicBean", Music.class);
    //    MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();
        musicPlayer.playMusicList();

        System.out.println("Name: " + musicPlayer.getName());
        System.out.println("Value: " + musicPlayer.getVolume());

        context.close();
    }
}
