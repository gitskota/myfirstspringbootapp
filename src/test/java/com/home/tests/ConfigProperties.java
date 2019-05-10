package com.home.tests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties
@PropertySource(value="classpath:application.properties")

public class ConfigProperties{

    public void ConfigProperties(){

    }

    @Value("${app.uri}")
    String url;

    public String getUri() {
        System.out.println(url);
        return url;
    }

}
