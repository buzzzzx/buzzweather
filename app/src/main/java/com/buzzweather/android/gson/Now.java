package com.buzzweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 鲨鱼辣椒 on 2017/4/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
