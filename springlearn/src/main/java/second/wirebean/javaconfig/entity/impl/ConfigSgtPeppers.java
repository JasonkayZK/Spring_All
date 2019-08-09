package second.wirebean.javaconfig.entity.impl;

import second.wirebean.javaconfig.entity.ConfigCompactDisc;

/**
 * @author zk
 * @DATE 19-8-9
 */
public class ConfigSgtPeppers implements ConfigCompactDisc {

    private String title = "Sgt. Pepper's Club Band!";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
