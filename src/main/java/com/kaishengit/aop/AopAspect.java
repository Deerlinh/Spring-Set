package com.kaishengit.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by 蔡林红 on 2017/10/29.
 */
public class AopAspect {

    public void beforAdvice(){
        System.out.println("前置通知");
    }

    public void afterReturning(){
        System.out.println("后置通知");
    }
    public void afterThowing(){
        System.out.println("异常通知");
    }
    public  void after(){
        System.out.println("最终通知");
    }
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object result = null;
         try {
                System.out.println("前置通知");
                result = joinPoint.proceed();
                System.out.println("后置");
            } catch (Throwable throwable) {
                System.out.println("异常");
            } finally {
                System.out.println("最终");

            }
         return result;
    }
}
