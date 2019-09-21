package fourth.aop.annotationaspect.entity.impl;

import fourth.aop.annotationaspect.entity.Performance;
import org.springframework.stereotype.Component;

/**
 * @author zk
 * @DATE 19-8-10
 */
@Component
public class Concert implements Performance {

    @Override
    public void perform() {
        System.out.println("Performing!");
    }

}
