package second.wirebean.auto.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import second.wirebean.auto.entity.CompactDisc;

/**
 * @author zk
 * @DATE 19-8-8
 */

@Configuration
//@ComponentScan(value = "second.wirebean.auto.entity")
//@ComponentScan(basePackages = "second.wirebean.auto.entity")
@ComponentScan(basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig {

}
