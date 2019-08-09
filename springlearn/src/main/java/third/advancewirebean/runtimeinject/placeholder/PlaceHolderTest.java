package third.advancewirebean.runtimeinject.placeholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import third.advancewirebean.runtimeinject.placeholder.config.ExpressiveConfig;
import third.advancewirebean.runtimeinject.placeholder.entity.BlankDisc;

import static org.junit.Assert.assertNotNull;

/**
 * @author zk
 * @DATE 19-8-9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class PlaceHolderTest {

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void checkConfig() {
        System.out.println("OK!");
    }

    @Test
    public void checkBean() {
        System.out.println(blankDisc);
        assertNotNull(blankDisc);
    }


}
