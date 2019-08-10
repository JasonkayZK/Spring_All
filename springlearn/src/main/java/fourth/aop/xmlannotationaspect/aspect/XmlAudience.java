package fourth.aop.xmlannotationaspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zk
 * @DATE 19-8-10
 */
public class XmlAudience {

    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    public void takeSeats() {
        System.out.println("Taking seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("[Around: ] Silence Cellphones");
            System.out.println("[Around: ] Taking seats");
            joinPoint.proceed();
            System.out.println("[Around: ] CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("[Around: ] Demanding a refund");
        }
    }

}
