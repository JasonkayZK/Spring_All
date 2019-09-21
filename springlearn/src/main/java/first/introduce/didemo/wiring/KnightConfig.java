package first.introduce.didemo.wiring;

import first.introduce.entity.impl.BraveKnight;
import first.introduce.entity.Knight;
import first.introduce.entity.Quest;
import first.introduce.entity.impl.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zk
 * @DATE 19-8-8
 */

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }


}
