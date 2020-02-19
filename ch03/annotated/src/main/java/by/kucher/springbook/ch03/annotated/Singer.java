package by.kucher.springbook.ch03.annotated;

import org.springframework.stereotype.Component;

@Component("Other name Singer")
@Trophy(name = { "grammy", "platium disk" })
public class Singer {

    private String lyric = "string lyric var";

    public void sing() {
        System.out.println(lyric);
    }

}
