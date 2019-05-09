package com.home.springboot;

import com.home.tests.BaseAbstractTest;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(BaseAbstractTest.class)
public class SpringBootHelloWorld {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BaseAbstractTest.class);

        BaseAbstractTest baseAbstractTest = applicationContext.getBean(BaseAbstractTest.class);

        System.out.println("URL from main: "+ baseAbstractTest.getUri());

    }
}
