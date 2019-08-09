package third.advancewirebean.ambiguousbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import third.advancewirebean.ambiguousbean.annotation.Cold;
import third.advancewirebean.ambiguousbean.annotation.Creamy;
import third.advancewirebean.ambiguousbean.annotation.Fruity;
import third.advancewirebean.ambiguousbean.entity.Dessert;
import third.advancewirebean.ambiguousbean.entity.impl.Cake;
import third.advancewirebean.ambiguousbean.entity.impl.Cookie;
import third.advancewirebean.ambiguousbean.entity.impl.Icecream;
import third.advancewirebean.ambiguousbean.entity.impl.Popsicle;

/**
 * @author zk
 * @DATE 19-8-9
 */
@Configuration
public class DessertConfig {

    @Bean
    @Cold
    @Creamy
    public Dessert icecream() {
        return new Icecream();
    }

    @Bean
    public Dessert cookie() {
        return new Cookie();
    }

    @Bean
//    @Primary
    public Dessert cake() {
        return new Cake();
    }

    @Bean
    @Cold
    @Fruity
    public Dessert popsicle() {
        return new Popsicle();
    }

}
