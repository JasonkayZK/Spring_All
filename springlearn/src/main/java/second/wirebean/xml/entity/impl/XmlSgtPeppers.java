package second.wirebean.xml.entity.impl;

import second.wirebean.xml.entity.XmlCompactDisc;

/**
 * @author zk
 * @DATE 19-8-9
 */
public class XmlSgtPeppers implements XmlCompactDisc {

    private String title = "Sgt. Pepper's Club Band!";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
