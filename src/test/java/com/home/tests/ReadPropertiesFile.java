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

        System.out.println("\nlocaluri from application.properties file: "+ url);
        System.out.println("\nserverport from application.properties file: "+ serverPort);
        System.out.println("\napp.code1 from application.properties file: "+ code1);
        System.out.println("\napp.login from application.properties file: "+ login);


        System.out.println("\nlocal.prop1 from application-local.properties file: "+ localProp1);
        System.out.println("\nlocal.prop2 from application-local.properties file: "+ localProp2);

        System.out.println("\nqa.prop1 from application-qa.properties file: "+ qaProp1);
        System.out.println("\nqa.prop2 from application-qa.properties file: "+ qaProp2);

    }

}
