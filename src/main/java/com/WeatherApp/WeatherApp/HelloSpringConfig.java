package com.WeatherApp.WeatherApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class HelloSpringConfig {

    @Bean
    public HelloWorld helloWorld(){

        return new HelloWorld();
    }

    @Bean
    public WebMvcConfigurer forwardToIndex(){
        return new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry){
                registry.addViewController("/").setViewName(
                        "forward:index.html");
            }
        };
    }

}
