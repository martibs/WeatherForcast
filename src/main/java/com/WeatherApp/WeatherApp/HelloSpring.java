package com.WeatherApp.WeatherApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class HelloSpring {

    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(WeatherAppConfig.class);
        ApiConnection apiConnection = ctx.getBean(ApiConnection.class);
        apiConnection.showWeatherDataForToday("45.353", "53.327");
    }


}




