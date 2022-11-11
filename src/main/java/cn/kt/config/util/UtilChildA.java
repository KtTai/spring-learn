package cn.kt.config.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class UtilChildA {
    private String a= "aaa";

    public String getName(){
        return "childa";
    }
    public String method1(){
        return "child1a";
    }


    @PostConstruct
    public void init(){
        System.out.println("utilsChildA init");
    }

    @PreDestroy
    public void destory(){
        System.out.println("utilsChildA destory");
    }
}
