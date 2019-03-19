package com.yxw.tool.entity;

/**
 * @Author:阿倪
 * @Date: 2019/3/8 21:19
 * @Description:
 * @return:
 * @throws:
 */
public class Province {

    private int provinceId;
    private String provinceName;
    private String comment;
    private Integer provinceNum;
    private int countryId;
    private String provinceShort;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getProvinceNum() {
        return provinceNum;
    }

    public void setProvinceNum(Integer provinceNum) {
        this.provinceNum = provinceNum;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getProvinceShort() {
        return provinceShort;
    }

    public void setProvinceShort(String provinceShort) {
        this.provinceShort = provinceShort;
    }
}
