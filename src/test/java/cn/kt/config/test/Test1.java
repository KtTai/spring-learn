package cn.kt.config.test;

import cn.kt.config.configuration.UserConfig;
import cn.kt.config.service.UserConfigService;
import cn.kt.config.util.UtilChild;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class Test1 {


    @Test
    public void configTest1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
           UserConfigService userServiceImpl = (UserConfigService) applicationContext.getBean("userConfigServiceImpl");
        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        beanFactory.destroyBean("fasdf");
        UtilChild utilChild = applicationContext.getBean("utilChild",UtilChild.class);
        System.out.println(utilChild.method1()+"+++++++++++++++++++++++");
        System.out.println(userServiceImpl.getClass().toString());
//        try {
//            TimeUnit.SECONDS.sleep(30);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        userServiceImpl.testConfigService();
//        try {
//            TimeUnit.SECONDS.sleep(60);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

}
