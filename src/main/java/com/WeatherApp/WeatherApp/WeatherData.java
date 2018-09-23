package com.WeatherApp.WeatherApp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherData {

    public String getTemperature(JSONObject jsondata) throws JSONException {
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

    public String getSymbol(JSONObject jsondata) throws JSONException {
        jsondata = (JSONObject) jsondata.get("weatherdata");
        jsondata = (JSONObject) jsondata.get("product");

        JSONArray array = jsondata.getJSONArray("time");

        jsondata = array.getJSONObject(1);
        jsondata = (JSONObject) jsondata.get("location");
        jsondata = (JSONObject) jsondata.get("symbol");
        String symbol = (String) jsondata.get("id");

        System.out.println(symbol);
        return symbol;
    }

    public String getTemperatureForTommorow(JSONObject jsondata) throws JSONException {

        Double value = null;

        jsondata = (JSONObject) jsondata.get("weatherdata");
        jsondata = (JSONObject) jsondata.get("product");

        JSONArray array = jsondata.getJSONArray("time");

        jsondata = array.getJSONObject(100);

        jsondata = (JSONObject) jsondata.get("location");

        if(jsondata.get("temperature") == null){
            jsondata = (JSONObject) jsondata.get("temperature");
            jsondata = (JSONObject) jsondata.get("weatherdata");
            jsondata = (JSONObject) jsondata.get("product");
            JSONArray array2 = jsondata.getJSONArray("time");
            jsondata = array2.getJSONObject(99);
            jsondata = (JSONObject) jsondata.get("location");
            jsondata = (JSONObject) jsondata.get("temperature");
            value = (Double) jsondata.get("value");

        }else{
            jsondata = (JSONObject) jsondata.get("temperature");
            value = (Double) jsondata.get("value");
        }
        return value.toString();
    }

    public String getSymbolForTommorow(JSONObject jsondata) throws JSONException {

        String symbol = null;

        jsondata = (JSONObject) jsondata.get("weatherdata");
        jsondata = (JSONObject) jsondata.get("product");

        JSONArray array = jsondata.getJSONArray("time");

        jsondata = array.getJSONObject(101);
        jsondata = (JSONObject) jsondata.get("location");


        if(jsondata.get("symbol") == null){
            jsondata = (JSONObject) jsondata.get("symbol");
            jsondata = (JSONObject) jsondata.get("weatherdata");
            jsondata = (JSONObject) jsondata.get("product");
            JSONArray array2 = jsondata.getJSONArray("time");
            jsondata = array2.getJSONObject(100);
            jsondata = (JSONObject) jsondata.get("location");
            jsondata = (JSONObject) jsondata.get("symbol");
            symbol = (String) jsondata.get("id");
        }else{
            jsondata = (JSONObject) jsondata.get("symbol");
            symbol = (String) jsondata.get("id");
        }
        return symbol;
    }

}
