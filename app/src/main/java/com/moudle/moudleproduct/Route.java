package com.moudle.moudleproduct;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018/7/23.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Route {

    /**
     *  路由的路径，标识一个路径
     */
    String path();

    /**
     *
     * 将路由节点进行分组，可以实现按组动态加载
     */
    String group() default "";
}
