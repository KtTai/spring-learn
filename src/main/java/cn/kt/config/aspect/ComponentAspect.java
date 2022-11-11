package cn.kt.config.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ComponentAspect {
    @Pointcut("(execution(* cn.kt.config.util..*.*(..)))")
    public void pt1(){

    }

//    @Around("pt1()")
    public Object aroundM(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed = null;
        try {
            System.out.println("around start");
            proceed = proceedingJoinPoint.proceed();
            System.out.println("around end");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return proceed;
    }
}
