package fourth.aop.annotationaspect;

import fourth.aop.annotationaspect.config.ConcertConfig;
import fourth.aop.annotationaspect.entity.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author zk
 * @DATE 19-8-10
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertTest {

    @Autowired
    private Performance performance;

    @Test
    public void checkConfig() {
        System.out.println("OK!");
    }

    @Test
    public void checkBean() {
        assertNotNull(performance);
    }

    @Test
    public void checkAspect() {
        performance.perform();
    }
}
