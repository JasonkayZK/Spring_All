package third.advancewirebean.runtimeinject.spel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import third.advancewirebean.runtimeinject.spel.entity.BlankDisc;

/**
 * @author zk
 * @DATE 19-8-10
 */
@Configuration
public class EpelConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BlankDisc blankDisc(@Value("#{systemProperties['disc.title']}") String title, @Value("#{systemProperties['disc.artist']}") String artist) {
        System.out.println("ok!");
        return new BlankDisc(title, artist);
    }



}
