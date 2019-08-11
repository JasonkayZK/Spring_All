package club.jasonkayzk666.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author zk
 * @DATE 19-8-11
 */
@Configuration
@ComponentScan(basePackages = {"club.jasonkayzk666"},
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION, value = EnableWebMvc.class
        )})
public class RootConfig {
}
