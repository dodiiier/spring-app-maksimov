package org.example.maksimov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();
    }
}






        //внедрение назависимости вручную
        //Music music = context.getBean("musicBean", Music.class); // получаем зависимость из спрингконтекста
        //MusicPlayer musicPlayer = new MusicPlayer(music); //внедряем зависимость в конструктор
        // к задаче
        // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // musicPlayer.setMyList();

        //System.out.println(musicPlayer.getName()); // получаем значение  полей после внедрения зависимостей
        //System.out.println(musicPlayer.getVolume());

