package third.advancewirebean.conditionalbean.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zk
 * @DATE 19-8-9
 */
public class MagicExistsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
//        Environment env = conditionContext.getEnvironment();
//        return env.containsProperty("magic");
        return true;
    }


}
