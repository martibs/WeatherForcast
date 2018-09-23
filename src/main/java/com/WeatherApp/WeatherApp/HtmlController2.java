package com.WeatherApp.WeatherApp;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/tomorrow")
public class HtmlController2 {


    private GenerateJavascript generateJavascript = new GenerateJavascript();
    private ApiConnection apiConnection = new ApiConnection();
    private WeatherData weatherData = new WeatherData();


    @GetMapping
    public String tomorrow() throws IOException {
        JSONObject oslo = apiConnection.getApiDataFromApiMet("59.911491", "10.757933");
        JSONObject bergen = apiConnection.getApiDataFromApiMet("60.39299", "5.32415");
        JSONObject trondheim = apiConnection.getApiDataFromApiMet("63.446827", "10.421906");
        JSONObject tromso = apiConnection.getApiDataFromApiMet("69.649208", "18.955324");
        JSONObject stavanger = apiConnection.getApiDataFromApiMet("58.969975", "5.733107");


        String osloIcon = weatherData.getSymbolForTommorow(oslo);
        String bergenIcon = weatherData.getSymbolForTommorow(bergen);
        String trondheimIcon = weatherData.getSymbolForTommorow(trondheim);
        String tromsoIcon = weatherData.getSymbolForTommorow(tromso);
        String stavangerIcon = weatherData.getSymbol(stavanger);

        String osloTemp = weatherData.getTemperatureForTommorow(oslo);
        String bergenTemp = weatherData.getTemperatureForTommorow(bergen);
        String trondheimTemp = weatherData.getTemperatureForTommorow(trondheim);
        String tromsoTemp = weatherData.getTemperatureForTommorow(tromso);
        String stavangerTemp = weatherData.getTemperatureForTommorow(stavanger);

        String stuff = generateJavascript.map(osloIcon, stavangerIcon, bergenIcon, tromsoIcon, trondheimIcon, osloTemp, stavangerTemp, bergenTemp, tromsoTemp, trondheimTemp);

        return stuff;
    }


}
