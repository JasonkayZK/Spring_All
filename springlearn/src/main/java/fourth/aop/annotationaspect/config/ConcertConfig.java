package fourth.aop.annotationaspect.config;

import fourth.aop.annotationaspect.aspect.Audience;
import fourth.aop.annotationaspect.entity.impl.Concert;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zk
 * @DATE 19-8-10
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Concert concert() {
        return new Concert();
    }

}
