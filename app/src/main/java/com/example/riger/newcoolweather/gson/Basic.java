package com.example.riger.newcoolweather.gson;

import com.google.gson.annotations.SerializedName;
/**
 * Created by riger on 2017/3/22.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
