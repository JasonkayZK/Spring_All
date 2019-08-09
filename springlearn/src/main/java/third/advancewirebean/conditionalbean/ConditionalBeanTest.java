package third.advancewirebean.conditionalbean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import third.advancewirebean.conditionalbean.config.ConditionalBeanConfig;
import third.advancewirebean.conditionalbean.entity.MagicBean;

/**
 * @author zk
 * @DATE 19-8-9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConditionalBeanConfig.class})
public class ConditionalBeanTest {

    @Autowired(required = false)
    private MagicBean magicBean;

    @Test
    public void checkConfig() {
        System.out.println("ok!");
    }

    @Test
    public void checkMagicBean() {
        Assert.assertNotNull(magicBean);
    }

}
