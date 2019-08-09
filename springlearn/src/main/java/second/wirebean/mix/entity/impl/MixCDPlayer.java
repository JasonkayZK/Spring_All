package second.wirebean.mix.entity.impl;

import second.wirebean.mix.entity.MixCompactDisc;
import second.wirebean.mix.entity.MixMediaPlayer;

/**
 * @author zk
 * @DATE 19-8-9
 */
public class MixCDPlayer implements MixMediaPlayer {

    private MixCompactDisc cd;

    public MixCDPlayer() {}

    public MixCDPlayer(MixCompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }


}
