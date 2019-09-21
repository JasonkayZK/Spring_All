package fourth.aop.xmlannotationaspect.entity.impl;

import fourth.aop.xmlannotationaspect.entity.XmlPerformance;

/**
 * @author zk
 * @DATE 19-8-10
 */
public class XmlConcert implements XmlPerformance {

    @Override
    public void perform() {
        System.out.println("Performing");
    }
}
