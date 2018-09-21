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
		ApplicationContext ctx = new AnnotationConfigApplicationContext(WeatherAppConfig.class);

		ApiConnection apiConnection = ctx.getBean(ApiConnection.class);

		SpringApplication.run(WeatherAppApplication.class, args);

		WeatherData weatherData = new WeatherData();

		JSONObject oslo = apiConnection.getApiDataFromApiMet("45.343", "64.232");
		weatherData.getSymbol(oslo);
		weatherData.getTemperature(oslo);

		Logic logic = new Logic();
		logic.maplink();
	}
}
