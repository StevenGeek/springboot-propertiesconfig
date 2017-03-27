package com.steven.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ReadPropertiesByEnvAndRelax implements InitializingBean {
    @Autowired
    private Environment environment;
1
    @PostConstruct
    public void envRead() {
        System.out.println(environment.getProperty("com.steven.test"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        RelaxedPropertyResolver resolver = new RelaxedPropertyResolver(environment, "com.steven");
        System.out.println("RelaxedPropertyResolver.property");
    }
}
