package second.wirebean.javaconfig;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import second.wirebean.javaconfig.config.CDPlayerConfig;
import second.wirebean.javaconfig.entity.ConfigCompactDisc;
import second.wirebean.javaconfig.entity.ConfigMedeaPlayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author zk
 * @DATE 19-8-9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private ConfigMedeaPlayer player;

    @Autowired
    private ConfigCompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Club Band! by The Beatles\n",
                log.getLog());

    }
}
