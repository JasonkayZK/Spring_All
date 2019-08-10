package fourth.aop.aspectparameter.config;

import fourth.aop.aspectparameter.aspect.TrackCounter;
import fourth.aop.aspectparameter.entity.AspectCompactDisc;
import fourth.aop.aspectparameter.entity.impl.AspectBlackDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zk
 * @DATE 19-8-10
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectParameterConfig {

    @Bean
    public AspectCompactDisc aspectCompactDisc() {
        AspectBlackDisc disc = new AspectBlackDisc();

        List<String> tracks = new ArrayList<>();
        tracks.add("Easy Love");
        tracks.add("Middle Love");
        tracks.add("Hard Love");
        disc.setTracks(tracks);
        return disc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }

}
