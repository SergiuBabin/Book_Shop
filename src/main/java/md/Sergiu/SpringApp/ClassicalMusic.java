package md.Sergiu.SpringApp;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * @author Babin Sergiu
 * @created 06/03/2021 - 21:50
 * @project Book_Shop
 */

public class ClassicalMusic implements Music {
    List<String> music = Arrays.asList("Hungarian Rhapsody","Mozart – Eine kleine Nachtmusik","Beethoven – Für Elise",
            "Puccini – 'O mio babbino caro' from Gianni Schicchi", "J.S. Bach – Toccata and Fugue in D minor");



    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSong() {
        return music;
    }

    @Override
    public String getType() {
        return "CLASSICAL";
    }
}
