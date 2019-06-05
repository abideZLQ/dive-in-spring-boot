package com.zlq.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * After HelloWorld {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * 通过泛型的方式实现 - implements ApplicationListener<>
 * 监听什么事件 - ApplicationListener<ContextRefreshedEvent>
 * 排序 - Ordered接口 (相同事件才会进行排序)
 *
 * @author zlq
 * @since 2019/6/5
 */
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>,Ordered {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("AfterHelloWorld : " + event.getApplicationContext().getId()
                + " , timestamp : " + event.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
