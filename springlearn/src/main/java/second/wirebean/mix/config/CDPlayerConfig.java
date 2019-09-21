package second.wirebean.mix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import second.wirebean.mix.entity.MixCompactDisc;
import second.wirebean.mix.entity.MixMediaPlayer;
import second.wirebean.mix.entity.impl.MixCDPlayer;

/**
 * @author zk
 * @DATE 19-8-9
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public MixMediaPlayer cdPlayer(MixCompactDisc compactDisc) {
        return new MixCDPlayer(compactDisc);
    }

}
