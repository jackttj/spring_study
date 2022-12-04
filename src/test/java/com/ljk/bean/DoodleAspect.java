package com.ljk.bean;

import com.ljk.aop.advice.AroundAdvice;
import com.ljk.aop.annotation.Aspect;
import com.ljk.core.annotation.Controller;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

@Slf4j
@Aspect(target = Controller.class)
public class DoodleAspect implements AroundAdvice {

    @Override
    public void before(Class<?> clz, Method method, Object[] args) throws Throwable {
        log.info("Before  DoodleAspect ----> class: {}, method: {}", clz.getName(), method.getName());
    }

    @Override
    public void afterReturning(Class<?> clz, Object returnValue, Method method, Object[] args) throws Throwable {
        log.info("After  DoodleAspect ----> class: {}, method: {}", clz, method.getName());
    }

    @Override
    public void afterThrowing(Class<?> clz, Method method, Object[] args, Throwable e) {
        log.error("Error  DoodleAspect ----> class: {}, method: {}, exception: {}", clz, method.getName(), e.getMessage());
    }
}