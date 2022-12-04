package com.ljk.aop;

import com.ljk.aop.advice.Advice;
import com.ljk.aop.annotation.Aspect;
import com.ljk.core.BeanContainer;
import lombok.extern.slf4j.Slf4j;

/**
 * Aop执行器
 */
@Slf4j
public class Aop {

    /**
     * Bean容器
     */
    private BeanContainer beanContainer;

    public Aop() {
        beanContainer = BeanContainer.getInstance();
    }

    public void doAop() {
        beanContainer.getClassesBySuper(Advice.class)
                .stream()
                .filter(clz -> clz.isAnnotationPresent(Aspect.class))
                .forEach(clz -> {

                    // 这是通知方法 advice /*
                    /*
                    adcice的功能就是接口实现，就是你要增加的功能
                     */
                    final Advice advice = (Advice) beanContainer.getBean(clz);

                    // 这是注解 切片后面 的功能 aspect
                    /*
                    通知围绕的目标  ，在该目标的基础上增加功能，可以增加前置功能，也可以增加后置的功能
                     */

                    Aspect aspect = clz.getAnnotation(Aspect.class);
                    beanContainer.getClassesByAnnotation(aspect.target())
                            .stream()
                            .filter(target -> !Advice.class.isAssignableFrom(target))// 找到目标类
                            .filter(target -> !target.isAnnotationPresent(Aspect.class))
                            .forEach(target -> {
                                ProxyAdvisor advisor = new ProxyAdvisor(advice);// 用找到的目标类创建一个代理类
                                Object proxyBean = ProxyCreator.createProxy(target, advisor);
                                beanContainer.addBean(target, proxyBean);
                            });
                });
    }
}