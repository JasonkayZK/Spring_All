package fourth.aop.newfeatureaspect.config;

import fourth.aop.newfeatureaspect.aspect.EncoreableIntroducerConfig;
import fourth.aop.newfeatureaspect.entity.Encoreable;
import fourth.aop.newfeatureaspect.entity.Performance;
import fourth.aop.newfeatureaspect.entity.impl.Concert;
import fourth.aop.newfeatureaspect.entity.impl.DefaultEncoreable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zk
 * @DATE 19-8-10
 */
@Configuration
@EnableAspectJAutoProxy
public class NewFeatureAspectConfig {

    @Bean
    public EncoreableIntroducerConfig introducerConfig() {
        return new EncoreableIntroducerConfig();
    }

    @Bean
    public Performance performance() {
        return new Concert();
    }

    @Bean
    public Encoreable encoreable() {
        return new DefaultEncoreable();
    }

}
