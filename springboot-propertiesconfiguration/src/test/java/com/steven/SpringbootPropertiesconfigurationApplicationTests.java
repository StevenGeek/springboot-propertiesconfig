package com.steven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.steven.service.ReadPropertiesFromClass;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootPropertiesconfigurationApplicationTests {
    @Autowired
    private ReadPropertiesFromClass readproertiesFromClass;

    @Test
    public void contextLoads() {
        System.out.println(readproertiesFromClass.ReadFromValueComment());
    }

}
