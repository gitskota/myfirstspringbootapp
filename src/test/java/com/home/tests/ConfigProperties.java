package com.home.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

//@Configuration
//@ConfigurationProperties
//@PropertySource(value="classpath:application.properties")

@SpringBootTest
@DirtiesContext

public class ConfigProperties extends AbstractTestNGSpringContextTests {

    public void ConfigProperties(){

    }

    @Value("${localuri}")
    protected String url;

    @Value("${serverport}")
    protected String serverPort;

    @Value("${app.code1}")
    protected String code1;

    @Value("${app.login}")
    protected String login;

}
