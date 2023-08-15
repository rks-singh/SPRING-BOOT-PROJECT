package com.ravi.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy() method :: executed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() Method :: executed");
    }
}
