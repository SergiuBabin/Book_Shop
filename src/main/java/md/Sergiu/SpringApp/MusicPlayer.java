package md.Sergiu.SpringApp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.SortedMap;

/**
 * @author Babin Sergiu
 * @created 06/03/2021 - 21:52
 * @project Book_Shop
 */
@Component
public class MusicPlayer {


    @Autowired
    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    // IoC

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public MusicPlayer() {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(nusic m) {
        String ret;
        ret = "Playing: ";
        Random rand = new Random();
        for (Music music : musicList) {

            if (music.getType().equals(m.toString())) {
                ret += "\n    " + music.getSong().get(rand.nextInt(4));
                System.out.println();

            }
        }
        return ret;
    }
}

