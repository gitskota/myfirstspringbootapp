package com.home.tests;

import com.home.springboot.SpringBootHelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

@SpringBootTest(classes = SpringBootHelloWorld.class)
@EnableConfigurationProperties
public class ReadPropertiesFile extends BaseAbstractTest {

    @Test
    public void getURIFromPropertiesFile(){

        String url = getUri();
        System.out.println("URL from abstract class: "+ url);
    }

}
