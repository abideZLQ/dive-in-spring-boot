package com.zlq.diveinspringboot.listener;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWorld {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * 通过泛型的方式实现 - implements ApplicationListener<>
 * 监听什么事件 - ApplicationListener<ContextRefreshedEvent>
 * 排序 - @Order (相同事件才会进行排序)
 *
 * @author zlq
 * @since 2019/6/5
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {


    /**
     * 当事件到达，怎么处理.
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("HelloWorld : " + event.getApplicationContext().getId()
                + " , timestamp : " + event.getTimestamp());
    }
}
