package fourth.aop.newfeatureaspect.entity.impl;

import fourth.aop.newfeatureaspect.entity.Encoreable;

/**
 * @author zk
 * @DATE 19-8-10
 */
public class DefaultEncoreable implements Encoreable {

    @Override
    public void performEncore() {
        System.out.println("Encoring!");
    }
}
