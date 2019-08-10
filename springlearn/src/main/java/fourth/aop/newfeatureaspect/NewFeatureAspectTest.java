package fourth.aop.newfeatureaspect;

import fourth.aop.newfeatureaspect.config.NewFeatureAspectConfig;
import fourth.aop.newfeatureaspect.entity.Encoreable;
import fourth.aop.newfeatureaspect.entity.Performance;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zk
 * @DATE 19-8-10
 */
public class NewFeatureAspectTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NewFeatureAspectConfig.class);
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        Encoreable encore = (Encoreable)performance;
        encore.performEncore();
        context.close();
    }

}
