package md.Sergiu.SpringApp;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Babin Sergiu
 * @created 06/03/2021 - 22:55
 * @project Book_Shop
 */

public class JazzMusic implements Music{
    List<String> music = Arrays.asList("Frank Sinatra – Fly Me To The Moon", "Duke Ellington & His Famous Orchestra – Mood Indigo",
            "All The Things You Are", "Dave Brubeck Quartet – ‘Take Five’");
    @Override
    public List<String> getSong() {
        return music;
    }

    @Override
    public String getType() {
        return "JAZZ";
    }
}
