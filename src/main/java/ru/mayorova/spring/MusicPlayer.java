package ru.mayorova.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
   // private Music music;
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;


    //IoC (through constructor)
//    public MusicPlayer(Music music) {
//        this.music = music;
//
//    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer() {

    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public void playMusic() {
//        System.out.println("Playing song: " + music.getSong());
//    }

    public void playMusicList(){
        for (Music music : musicList){
            System.out.println("Playing song: " + music.getSong());
        }
    }
}
