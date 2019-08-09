package second.wirebean.xml.entity.impl;

import second.wirebean.xml.entity.XmlCompactDisc;
import second.wirebean.xml.entity.XmlMediaPlayer;

/**
 * @author zk
 * @DATE 19-8-9
 */
public class XmlCDPlayer implements XmlMediaPlayer {

    private XmlCompactDisc cd;

    public XmlCDPlayer(XmlCompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }


}
