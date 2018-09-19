package com.WeatherApp.WeatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class WeatherAppApplication {

	// The server

	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(WeatherAppConfig.class);

		ApiConnection apiConnection = ctx.getBean(ApiConnection.class);

		SpringApplication.run(WeatherAppApplication.class, args);

		apiConnection.showWeatherDataForToday("45.343", "64.232");

	}
}
