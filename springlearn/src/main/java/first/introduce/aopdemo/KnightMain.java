package first.introduce.aopdemo;

import first.introduce.entity.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zk
 * @DATE 19-8-8
 */
public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
