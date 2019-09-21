package fourth.aop.newfeatureaspect.aspect;

import fourth.aop.newfeatureaspect.entity.Encoreable;
import fourth.aop.newfeatureaspect.entity.impl.DefaultEncoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author zk
 * @DATE 19-8-10
 */
@Aspect
public class EncoreableIntroducerConfig {

    @DeclareParents(value = "fourth.aop.newfeatureaspect.entity.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
