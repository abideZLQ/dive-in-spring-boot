package com.zlq.diveinspringboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 系统属性条件判断
 *
 * @author zlq
 * @since 2019/6/3
 */
public class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取元数据注解键值对
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        // profile配置的属性
        String propertyName = String.valueOf( attributes.get("name") );
        // profile配置的属性
        String propertyValue = String.valueOf(attributes.get("value"));

        // java系统属性
        String javaPropertyValue = System.getProperty(propertyName);

        return propertyValue.equals(javaPropertyValue);
    }
}
