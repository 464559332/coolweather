package com.sumavision.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 46455 on 2018/1/7.
 */

public class City extends DataSupport {

    private int id;

    private int provinceId;

    private String cityName;

    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
