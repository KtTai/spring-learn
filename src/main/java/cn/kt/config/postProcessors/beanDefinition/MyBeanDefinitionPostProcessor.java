package cn.kt.config.postProcessors.beanDefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanDefinitionPostProcessor implements BeanDefinitionRegistryPostProcessor,Ordered {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("bean定义 后置处理器 开始");
        Arrays.stream(registry.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("bean定义 后置处理器 结束");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("bean工厂 后置处理器 开始");
//        System.out.println(beanFactory.ge);
        System.out.println("bean工厂 后置处理器 结束");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
