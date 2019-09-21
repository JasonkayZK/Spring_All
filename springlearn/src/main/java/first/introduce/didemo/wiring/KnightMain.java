package first.introduce.didemo.wiring;

import first.introduce.entity.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zk
 * @DATE 19-8-8
 */


public class KnightMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}

