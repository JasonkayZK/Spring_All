package third.advancewirebean.ambiguousbean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import third.advancewirebean.ambiguousbean.annotation.Cold;
import third.advancewirebean.ambiguousbean.annotation.Fruity;
import third.advancewirebean.ambiguousbean.config.DessertConfig;
import third.advancewirebean.ambiguousbean.entity.Dessert;

import static org.junit.Assert.assertNotNull;

/**
 * @author zk
 * @DATE 19-8-9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class AmbiguousBeanAnnotationTest {

    @Autowired
    @Cold
//    @Creamy
    @Fruity
    private Dessert dessert;

    @Test
    public void checkConfig() {
        System.out.println("OK!");
    }

    @Test
    public void checkBean() {
        System.out.println(dessert);
        assertNotNull(dessert);
    }

}
