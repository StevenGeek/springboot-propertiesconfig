package com.steven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.steven.properties.CustomApplicationReadProperties;
import com.steven.properties.CustomSpringBootAppReadProperties;
import com.steven.properties.StaticReadPro;
import com.steven.service.ReadPropertiesFromClass;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootPropertiesconfigurationApplicationTests {
    @Autowired
    private ReadPropertiesFromClass readproertiesFromClass;
    @Autowired
    private CustomApplicationReadProperties customApplicationReadProperties;
    @Autowired
    private CustomSpringBootAppReadProperties customSpringBootAppReadProperties;

    @Test
    public void contextLoads() {
        System.out.println(readproertiesFromClass.ReadFromValueComment());
    }

    @Test
    public void CustomAppReadProperty() {
        System.out.println(customApplicationReadProperties.getCustomProperty());
    }

    @Test
    public void CustomReadSpringBootProperty() {
        System.out.println(customSpringBootAppReadProperties.getCustom());
    }

    @Test
    public void readStaticPro() {
        System.out.println(StaticReadPro.getStaticPro());
    }
}
