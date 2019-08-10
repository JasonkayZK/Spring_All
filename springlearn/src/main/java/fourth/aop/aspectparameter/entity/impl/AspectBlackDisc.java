package fourth.aop.aspectparameter.entity.impl;

import fourth.aop.aspectparameter.entity.AspectCompactDisc;

import java.util.List;

/**
 * @author zk
 * @DATE 19-8-9
 */
public class AspectBlackDisc implements AspectCompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track: tracks) {
            System.out.println("-Track: " + track);
        }
    }

    @Override
    public void playTrack(int trackNum) {
        System.out.println("[TrackNum]: " + trackNum + ", Playing : " + tracks.get(trackNum));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

}
