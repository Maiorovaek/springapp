package ru.mayorova.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private Music music;

    //IoC (through constructor)
    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing song: " + music.getSong());
    }
}
