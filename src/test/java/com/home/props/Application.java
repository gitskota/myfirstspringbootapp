package com.home.props;

import com.home.tests.ConfigProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigProperties.class);

        ConfigProperties configProperties = applicationContext.getBean(ConfigProperties.class);

        System.out.println("URL from main: "+ configProperties.getUri());

    }
}
