package cn.kt.config.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UtilChild {
    @Autowired
    private UtilParent utilParent;
    private String a= "aaa";

    public String getName(){
        return "child";
    }
    public String method1(){
        return "child1";
    }
}
