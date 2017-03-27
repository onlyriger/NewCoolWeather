package com.example.riger.newcoolweather.gson;

import java.util.List;

import com.google.gson.annotations.SerializedName;
/**
 * Created by riger on 2017/3/22.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
