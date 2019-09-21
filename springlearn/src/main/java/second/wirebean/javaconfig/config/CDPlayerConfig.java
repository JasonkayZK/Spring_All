package second.wirebean.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import second.wirebean.javaconfig.entity.ConfigCompactDisc;
import second.wirebean.javaconfig.entity.ConfigMedeaPlayer;
import second.wirebean.javaconfig.entity.impl.ConfigCDPlayer;
import second.wirebean.javaconfig.entity.impl.ConfigSgtPeppers;

/**
 * @author zk
 * @DATE 19-8-9
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public ConfigCompactDisc configSgtPeppers() {
        return new ConfigSgtPeppers();
    }

    @Bean
    public ConfigMedeaPlayer configCDPlayer(ConfigCompactDisc configCompactDisc) {
        ConfigCDPlayer cdPlayer = new ConfigCDPlayer();
        cdPlayer.setCd(configCompactDisc);
        return cdPlayer;
    }


}
