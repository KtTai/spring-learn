package cn.kt.config.controller;

import cn.kt.config.configuration.UserConfigOrder;
import cn.kt.config.service.UserConfigService;
import cn.kt.config.service.impl.UserConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

@Controller
public class UserConfigController {

    @Bean
    public UserConfigOrder getUserConfOrder(){
        return new UserConfigOrder();
    }
    @Autowired
    private UserConfigService userConfigService;
    public void useServer(){
        userConfigService.testConfigService();
    }
}
