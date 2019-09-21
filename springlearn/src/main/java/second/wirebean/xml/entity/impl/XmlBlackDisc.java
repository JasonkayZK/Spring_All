package second.wirebean.xml.entity.impl;

import second.wirebean.xml.entity.XmlCompactDisc;

import java.util.List;

/**
 * @author zk
 * @DATE 19-8-9
 */
public class XmlBlackDisc implements XmlCompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public XmlBlackDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track: tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
