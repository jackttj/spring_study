package com.ljk.bean;

import com.ljk.aop.Aop;

import com.ljk.core.BeanContainer;
import com.ljk.ioc.Ioc;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AopTest {
    @Test
    public void doAop() {
        BeanContainer beanContainer = BeanContainer.getInstance();
        beanContainer.loadBeans("com.ljk");
//        log.info(""+beanContainer.getClasses());
        new Aop().doAop();

        new Ioc().doIoc();

//        log.info(""+ beanContainer.getBeans());
        DoodleController controller = (DoodleController) beanContainer.getBean(DoodleController.class);
        controller.hello();///没有改变原来的代码结构 但是 功能的执行情况发生了变化，为什么？

        /**
         *
         */
    }
}