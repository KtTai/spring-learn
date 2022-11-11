package cn.kt.xml.test;

import cn.kt.xml.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class Test1 {

    @Test
    public void testFun1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-application.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.userTest2();
        /*try {
            TimeUnit.SECONDS.sleep(60*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
