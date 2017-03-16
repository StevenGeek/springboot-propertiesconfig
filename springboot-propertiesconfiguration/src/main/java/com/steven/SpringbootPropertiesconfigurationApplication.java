package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.steven.properties.CustomSpringBootAppReadProperties;

@SpringBootApplication
@EnableConfigurationProperties(CustomSpringBootAppReadProperties.class)
public class SpringbootPropertiesconfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPropertiesconfigurationApplication.class, args);
    }
}
