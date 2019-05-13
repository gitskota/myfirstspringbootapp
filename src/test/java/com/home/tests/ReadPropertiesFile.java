package com.home.tests;

import com.home.props.Application;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

@SpringBootTest//(classes = Application.class)
@SpringBootConfiguration
//@EnableConfigurationProperties(ConfigProperties.class)

public class ReadPropertiesFile extends ConfigProperties {

//    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigProperties.class);
//    ConfigProperties configProperties = applicationContext.getBean(ConfigProperties.class);

    @Test
    public void getPropertiesFromPropertiesFile(){

        System.out.println("app.uri from application.properties file: "+ url);
        System.out.println("\nserver.port from application.properties file: "+ serverPort);
    }

}
