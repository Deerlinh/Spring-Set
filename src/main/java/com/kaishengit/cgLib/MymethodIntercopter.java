package com.kaishengit.cgLib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by 蔡林红 on 2017/10/29.
 */
    //创建类MymethodIntercopter实现接口net.sf.cglib.proxy.MethodInterceptor
    public class MymethodIntercopter implements MethodInterceptor {
    @Override
    //实现接口的实现类；作为动态代理类的模板
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before---------");

        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println("After---------");

        return result;
    }
}
