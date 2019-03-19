package com.yxw.tool.entity;

/**
 * @Author:阿倪
 * @Date: 2019/3/9 9:43
 * @Description:
 * @return:
 * @throws:
 */
public class City {
    private Integer cityId;
    private String cityName;
    private String comment;
    private Integer cityNum;
    private Integer provinceNum;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getCityNum() {
        return cityNum;
    }

    public void setCityNum(Integer cityNum) {
        this.cityNum = cityNum;
    }

    public Integer getProvinceNum() {
        return provinceNum;
    }

    public void setProvinceNum(Integer provinceNum) {
        this.provinceNum = provinceNum;
    }
}
