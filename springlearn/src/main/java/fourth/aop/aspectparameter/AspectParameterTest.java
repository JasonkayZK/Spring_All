package fourth.aop.aspectparameter;

import fourth.aop.aspectparameter.aspect.TrackCounter;
import fourth.aop.aspectparameter.config.AspectParameterConfig;
import fourth.aop.aspectparameter.entity.AspectCompactDisc;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author zk
 * @DATE 19-8-10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AspectParameterConfig.class)
public class AspectParameterTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private AspectCompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void checkConfig() {
        System.out.println("OK!");
    }

    @Test
    public void testTrackCounter() {
        cd.playTrack(0);
        cd.playTrack(0);
        cd.playTrack(0);
        cd.playTrack(0);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(2);

        assertEquals(4, counter.getPlayCount(0));
        assertEquals(3, counter.getPlayCount(1));
        assertEquals(2, counter.getPlayCount(2));
    }

}
