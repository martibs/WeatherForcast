package com.WeatherApp.WeatherApp;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class WeatherAppApplication {

	// The server

	public static void main(String[] args) throws IOException {
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(WeatherAppConfig.class);

		SpringApplication.run(WeatherAppApplication.class, args);

	}
}
