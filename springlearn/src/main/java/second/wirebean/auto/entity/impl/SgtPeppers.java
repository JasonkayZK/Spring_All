package second.wirebean.auto.entity.impl;

import org.springframework.stereotype.Component;
import second.wirebean.auto.entity.CompactDisc;

/**
 * @author zk
 * @DATE 19-8-8
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Club Band!";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
