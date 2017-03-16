package com.steven.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReadProperties {
    @Value("${steven.classRead.a}")
    private String AA;

    public String getAA() {
        return AA;
    }

    public void setAA(String aA) {
        AA = aA;
    }
}
