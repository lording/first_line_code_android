package com.coolweather.android.gson;

import androidx.annotation.StringRes;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String tmperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
