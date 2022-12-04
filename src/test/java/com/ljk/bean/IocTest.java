package com.ljk.bean;

import com.ljk.core.BeanContainer;


import com.ljk.ioc.Ioc;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;




@Slf4j
public class IocTest {
    @Test
    public void doIoc() {
        BeanContainer beanContainer = BeanContainer.getInstance();

        beanContainer.loadBeans("com.ljk");
        for(Class<?> x:beanContainer.getClasses()){
            System.out.println(x);
        }

        log.info("............................");


        new Ioc().doIoc();
        DoodleController controller = (DoodleController) beanContainer.getBean(DoodleController.class);
        System.out.println(controller);
        controller.hello();
//        BeanContainer beanContainer1= (BeanContainer) beanContainer.getBean(BeanContainer.class);
//        System.out.println(beanContainer1);
//        System.out.println(beanContainer);


    }
}