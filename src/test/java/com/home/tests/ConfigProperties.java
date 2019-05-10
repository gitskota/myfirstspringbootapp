package com.home.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ConfigurationProperties
@PropertySource(value="classpath:application.properties")

public class ConfigProperties{

    public void ConfigProperties(){

    }

    @Value("${app.uri}")
    protected String url;

    @Value("${server.port}")
    protected String serverPort;


    public String getUri() {
        return url;
    }

    public String getServerPort(){
        return serverPort;
    }

}
