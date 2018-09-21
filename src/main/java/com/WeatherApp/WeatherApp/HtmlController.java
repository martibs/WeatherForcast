package com.WeatherApp.WeatherApp;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class HtmlController {


    private GenerateJavascript generateJavascript = new GenerateJavascript();
    private ApiConnection apiConnection = new ApiConnection();
    private WeatherData weatherData = new WeatherData();

    @GetMapping
    public String getGreet() throws IOException {

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

        String osloTemp = weatherData.getTemperature(oslo);
        String bergenTemp = weatherData.getTemperature(bergen);
        String trondheimTemp = weatherData.getTemperature(trondheim);
        String tromsoTemp = weatherData.getTemperature(tromso);
        String stavangerTemp = weatherData.getTemperature(stavanger);




        String stuff = generateJavascript.map(osloIcon, stavangerIcon, bergenIcon, tromsoIcon, trondheimIcon, osloTemp, stavangerTemp, bergenTemp, tromsoTemp, trondheimTemp);


        return stuff;
    }


}
