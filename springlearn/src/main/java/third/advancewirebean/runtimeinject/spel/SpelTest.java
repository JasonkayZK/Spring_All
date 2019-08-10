package third.advancewirebean.runtimeinject.spel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import third.advancewirebean.runtimeinject.spel.config.EpelConfig;
import third.advancewirebean.runtimeinject.spel.entity.BlankDisc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author zk
 * @DATE 19-8-10
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EpelConfig.class)
public class SpelTest {

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

    @Test
    public void checkBeanContent() {
        assertEquals("Love", blankDisc.getTitle());
        assertEquals("Taylor Swift", blankDisc.getArtist());
    }

}
