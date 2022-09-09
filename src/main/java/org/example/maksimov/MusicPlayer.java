package org.example.maksimov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(Sound sound) {
        Random random = new Random();
        int select = random.nextInt(3);
        if (sound == Sound.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(select));
        } else {
            System.out.println(rockMusic.getSong().get(select));
        }

    }
}


//private List<Music> musicList = new ArrayList<>();
//private Music music; // в качестве зависимости будет интерфейс музик, сможем играть музыку любого жанра

//private ClassicalMusic classicalMusic;
//private RockMusic rockMusic;


//    public void setMyList() {
//        for (Music music : musicList) {
//            System.out.println(music.getSong());
//        }


//IoC
//    public MusicPlayer(Music music){
//        this.music = music;// присваиваем нашему полу music, то что у нас было внедренно в нашу сущность(MusicPlayer)
//    }
//    public MusicPlayer(){
//
//    }
//    public void setMusic(Music music){
//        this.music = music; //
//    }
//    public void playMusic(){ // метод, в котором будет уже внедрена зависимость, будем получать песню
//        System.out.println("Playing: " + music.getSong());// чтобы получить наз песни
//    }


