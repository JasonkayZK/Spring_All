package third.advancewirebean.runtimeinject.placeholder.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import third.advancewirebean.runtimeinject.placeholder.entity.BlankDisc;

/**
 * @author zk
 * @DATE 19-8-9
 */
@Configuration
@PropertySource("classpath:placeholder.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
    }


}
