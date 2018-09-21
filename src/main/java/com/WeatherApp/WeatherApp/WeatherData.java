package com.WeatherApp.WeatherApp;

import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherData {

    public String getTemperature(JSONObject jsondata){

        jsondata = (JSONObject) jsondata.get("weatherdata");
        jsondata = (JSONObject) jsondata.get("product");

        JSONArray array = jsondata.getJSONArray("time");

        jsondata = array.getJSONObject(0);
        jsondata = (JSONObject) jsondata.get("location");
        jsondata = (JSONObject) jsondata.get("temperature");
        Double value = (Double) jsondata.get("value");

        System.out.println(value);
        return value.toString();
    }

    public String getSymbol(JSONObject jsondata){
        jsondata = (JSONObject) jsondata.get("weatherdata");
        jsondata = (JSONObject) jsondata.get("product");

        JSONArray array = jsondata.getJSONArray("time");

        jsondata = array.getJSONObject(1);
        jsondata = (JSONObject) jsondata.get("location");
        jsondata = (JSONObject) jsondata.get("symbol");
        String symbol = (String) jsondata.get("id");

        /*
        Rain
        Drizzle
        LightRain

        DrizzleSun
        LightRainSun

        PartlyCloud
        Cloud
        LightCloud

        Sun
         */


        System.out.println(symbol);
        return symbol;
    }


}
