package md.Sergiu.SpringApp;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Babin Sergiu
 * @created 06/03/2021 - 21:51
 * @project Book_Shop
 */
public class RockMusic implements Music {
    List<String> music = Arrays.asList("Dexys Midnight Runners", "Dr. Hook and the Medicine Show",
            "Huey Lewis & The News", "The Isley Brothers", "Wind cries Mary");
    @Override
    public List<String> getSong() {
        return music;
    }

    @Override
    public String getType() {
        return "ROCK";
    }
}
