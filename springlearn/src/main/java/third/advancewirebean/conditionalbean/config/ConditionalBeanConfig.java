package third.advancewirebean.conditionalbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import third.advancewirebean.conditionalbean.condition.MagicExistsCondition;
import third.advancewirebean.conditionalbean.entity.MagicBean;

/**
 * @author zk
 * @DATE 19-8-9
 */
@Configuration
public class ConditionalBeanConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

}
