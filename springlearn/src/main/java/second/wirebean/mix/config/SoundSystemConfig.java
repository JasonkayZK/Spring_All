package second.wirebean.mix.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zk
 * @DATE 19-8-9
 */
@Configuration
@Import({CDConfig.class, CDPlayerConfig.class})
public class SoundSystemConfig {

}
