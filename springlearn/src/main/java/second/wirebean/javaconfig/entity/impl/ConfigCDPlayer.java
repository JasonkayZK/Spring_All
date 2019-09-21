package second.wirebean.javaconfig.entity.impl;

import second.wirebean.javaconfig.entity.ConfigCompactDisc;
import second.wirebean.javaconfig.entity.ConfigMedeaPlayer;

/**
 * @author zk
 * @DATE 19-8-9
 */
public class ConfigCDPlayer implements ConfigMedeaPlayer {

    private ConfigCompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }

    public ConfigCompactDisc getCd() {
        return cd;
    }

    public void setCd(ConfigCompactDisc cd) {
        this.cd = cd;
    }
}
