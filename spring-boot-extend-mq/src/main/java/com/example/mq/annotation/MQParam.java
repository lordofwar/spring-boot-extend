package com.example.mq.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version 1.0
 * @ClassName MQParam
 * @Description MQ消息参数
 * @Author mingj
 * @Date 2020/2/14 16:45
 **/
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface MQParam {

    String name();

    String serialize() default "String";
}