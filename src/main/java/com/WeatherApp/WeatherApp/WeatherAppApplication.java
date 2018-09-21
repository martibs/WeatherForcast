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

		GenerateJavascript generateJavascript = new GenerateJavascript();

		JSONObject oslo = apiConnection.getApiDataFromApiMet("59.911491", "10.757933");
		JSONObject bergen = apiConnection.getApiDataFromApiMet("60.39299", "5.32415");
		JSONObject trondheim = apiConnection.getApiDataFromApiMet("63.446827", "10.421906");
		JSONObject tromso = apiConnection.getApiDataFromApiMet("69.649208", "18.955324");
		JSONObject stavanger = apiConnection.getApiDataFromApiMet("58.969975", "5.733107");


		String osloIcon = weatherData.getSymbol(oslo);
		String bergenIcon = weatherData.getSymbol(bergen);
		String trondheimIcon = weatherData.getSymbol(trondheim);
		String tromsoIcon = weatherData.getSymbol(tromso);
		String stavangerIcon = weatherData.getSymbol(stavanger);


		System.out.println(generateJavascript.map(osloIcon, bergenIcon, trondheimIcon, tromsoIcon, stavangerIcon));

	}
}
