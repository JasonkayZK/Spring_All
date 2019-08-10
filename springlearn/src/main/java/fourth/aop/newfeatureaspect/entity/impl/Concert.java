package fourth.aop.newfeatureaspect.entity.impl;

import fourth.aop.newfeatureaspect.entity.Performance;

/**
 * @author zk
 * @DATE 19-8-10
 */
public class Concert implements Performance {

    @Override
    public void perform() {
        System.out.println("Performing!");
    }
}
