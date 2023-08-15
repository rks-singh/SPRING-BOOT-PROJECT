package com.ravi.configuration;

import com.ravi.utils.ConfigDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Constructor Executed..");
    }
    @Bean
    public void createAppConfigObject(){
        ConfigDemo configDemo = new ConfigDemo("Config");
        configDemo.display();
    }
}
