package fourth.aop.annotationaspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zk
 * @DATE 19-8-10
 */
@Aspect
@Component
public class Audience {

    @Pointcut("execution(* fourth.aop.annotationaspect.entity.Performance.perform(..))")
    private void performance() {}

//    @Before(value = "execution(** fourth.aop.annotationaspect.entity.Performance.perform(..))")
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

//    @Before(value = "execution(** fourth.aop.annotationaspect.entity.Performance.perform(..))")
    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

//    @AfterReturning(value = "execution(** fourth.aop.annotationaspect.entity.Performance.perform(..))")
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

//    @AfterThrowing(value = "execution(** fourth.aop.annotationaspect.entity.Performance.perform(..))")
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
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
