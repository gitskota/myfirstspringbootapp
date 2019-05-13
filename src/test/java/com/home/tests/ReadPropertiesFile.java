package com.home.tests;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

@SpringBootTest//(classes = Application.class)
@SpringBootConfiguration
//@EnableConfigurationProperties(ConfigProperties.class)

public class ReadPropertiesFile extends ConfigProperties {

//    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigProperties.class);
//    ConfigProperties configProperties = applicationContext.getBean(ConfigProperties.class);

    @Test
    public void getPropertiesFromPropertiesFile(){

        System.out.println("localuri from application.properties file: "+ url);
        System.out.println("\nserverport from application.properties file: "+ serverPort);
        System.out.println("\napp.code1 from application.properties file: "+ code1);
        System.out.println("\napp.login from application.properties file: "+ login);

    }

}
