package com.buzzweather.android.gson;

/**
 * Created by 鲨鱼辣椒 on 2017/4/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
