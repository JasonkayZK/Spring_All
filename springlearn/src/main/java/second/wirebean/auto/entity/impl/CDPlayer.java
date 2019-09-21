package second.wirebean.auto.entity.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import second.wirebean.auto.entity.CompactDisc;
import second.wirebean.auto.entity.MediaPlayer;

/**
 * @author zk
 * @DATE 19-8-8
 */
@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }
}
