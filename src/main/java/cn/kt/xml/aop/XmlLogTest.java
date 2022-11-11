package cn.kt.xml.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlLogTest {
    public void before(JoinPoint joinPoint){
        System.out.println("aaaaa.....before.............."+joinPoint);
    }
    public void after(JoinPoint joinPoint){
        System.out.println("aaaaa.....after.............."+joinPoint);
    }
    public void throwEx(JoinPoint joinPoint, Exception e){
        System.out.println("aaaaa.....throw.............."+ e);
    }
    public void returnR(JoinPoint joinPoint,Object a){
        System.out.println("aaaaa.....return.............."+a);
    }

    public void aroundR(ProceedingJoinPoint joinPoint){
        System.out.println("around before....");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("around throwing....");
            e.printStackTrace();
        } finally {
            System.out.println("around after....");
        }
        System.out.println("around return....");
    }
}
