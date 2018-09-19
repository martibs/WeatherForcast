package com.WeatherApp.WeatherApp;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ApiConnection {

    // Class that is delegated to the server in the Config -> WeatherAppConfig class

    private StringBuilder stringBuilder;
    private Model model;

    public ApiConnection(){
        stringBuilder = new StringBuilder();
    }

    public String transfereApiDataToString(String latitude, String longitude) throws IOException {
        String url = "https://api.met.no/weatherapi/locationforecast/1.9/?lat=" + latitude + "&lon=" + longitude;

        URLConnection connection = new URL(url).openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        connection.connect();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;

        while ((line = buffer.readLine()) != null) {
            stringBuilder.append(line);
        }

        buildModel();

        System.out.println(stringBuilder.toString());
        return "";
    }

    private void buildModel() throws IOException {

        Gson gson = new Gson();
        model = gson.fromJson(stringBuilder.toString(), Model.class);

    }

}
