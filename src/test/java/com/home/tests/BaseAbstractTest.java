package com.home.tests;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

//@Configuration // needed for main method

@Configuration
@ConfigurationProperties
@PropertySource(value="classpath:application.properties")
public class BaseAbstractTest extends AbstractTestNGSpringContextTests {

    public BaseAbstractTest(){
    }

    @Value("${uri}")
    protected String uri;

    public void setUri(String uri){
        this.uri=uri;
    }

    public String getUri() {
        return uri;
    }

}
