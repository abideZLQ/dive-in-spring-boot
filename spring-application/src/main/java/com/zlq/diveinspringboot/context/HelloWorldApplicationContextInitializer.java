package com.zlq.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * TODO...
 *
 * @author zlq
 * @since 2019/6/4
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C>{
    @Override
    public void initialize(C applicationContext) {
        System.out.println("ConfigurableApplicationContext.id = "+ applicationContext.getId());
    }
}
