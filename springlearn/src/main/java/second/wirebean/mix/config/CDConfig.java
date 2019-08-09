package second.wirebean.mix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import second.wirebean.mix.entity.MixCompactDisc;
import second.wirebean.mix.entity.impl.MixBlackDisc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zk
 * @DATE 19-8-9
 */
@Configuration
public class CDConfig {

    @Bean
    public MixCompactDisc compactDisc() {
        MixBlackDisc compactDisc = new MixBlackDisc();
        compactDisc.setArtist("Taylor Swift");
        compactDisc.setTitle("Love");

        List<String> list = new ArrayList<>();
        list.add("Easy Love");
        list.add("Middle Love");
        list.add("Hard Love");
        compactDisc.setTracks(list);
        return compactDisc;
    }

}
