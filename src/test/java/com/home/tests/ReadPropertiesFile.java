package com.home.tests;

import com.home.props.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.testng.annotations.Test;

@SpringBootTest(classes = Application.class)
@EnableConfigurationProperties(ConfigProperties.class)

public class ReadPropertiesFile extends ConfigProperties {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigProperties.class);
    ConfigProperties configProperties = applicationContext.getBean(ConfigProperties.class);

    String url = configProperties.url;
    String serverPort = configProperties.serverPort;

    @Test
    public void getPropertiesFromPropertiesFile(){

        System.out.println("\napp.uri from application.properties file: "+ url);
        System.out.println("\nserver.port from application.properties file: "+ serverPort);
    }

}
