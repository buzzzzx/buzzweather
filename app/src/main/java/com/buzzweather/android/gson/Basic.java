package com.buzzweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 鲨鱼辣椒 on 2017/4/24.
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
