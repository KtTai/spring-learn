package cn.kt.config.configuration;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
//@Import(UserConfigOrder.class)
@ComponentScan(value = "cn.kt.config"
//        ,
//        excludeFilters =
//                {
//                        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "cn.kt.config.controller.*")
//                }
                )
@EnableAspectJAutoProxy
public class UserConfig {
}
