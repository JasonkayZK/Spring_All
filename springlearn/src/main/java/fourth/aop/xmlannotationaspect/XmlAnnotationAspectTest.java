package fourth.aop.xmlannotationaspect;

import fourth.aop.xmlannotationaspect.entity.XmlPerformance;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zk
 * @DATE 19-8-10
 */
public class XmlAnnotationAspectTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:xmlannotationaspect.xml");
        context.getBean(XmlPerformance.class).perform();
        context.close();
    }
}
