package third.advancewirebean.profilebean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import third.advancewirebean.profilebean.config.DataSourceConfig;

/**
 * @author zk
 * @DATE 19-8-9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceConfig.class})
@ActiveProfiles("dev")
public class DataSourceTest {

    @Test
    public void testConfig() {
        System.out.println("OK");
    }

}
