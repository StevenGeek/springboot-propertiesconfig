package com.steven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.steven.properties.ApplicationReadProperties;

@Component
public class ReadPropertiesFromClass {
    @Autowired
    private ApplicationReadProperties aProperties;

    public String ReadFromValueComment() {
        return aProperties.getAA();
    }
}
