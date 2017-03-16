package com.steven.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/custom.properties")
public class StaticReadPro {

    // @Value("${custom.property}")
    private static String staticPro;

    public static String getStaticPro() {
        return staticPro;
    }

    @Value("${static.proA}")
    public void setStaticPro(String staticPro) {
        StaticReadPro.staticPro = staticPro;
    }
}
