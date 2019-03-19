package com.yxw.tool.entity;

import java.util.Date;

/**
 * @Author:阿倪
 * @Date: 2019/3/7 21:10
 * @Description:
 * @return:
 * @throws:
 */
public class School {

    private Integer schoolId;
    private String schoolName;
    private Integer schoolGrade;
    private String schoolAddr;
    private String schoolIntro;
    private String comment;
    private String schoolNum;
    private Integer schoolProvinceId;
    private Integer schoolCityId;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getSchoolGrade() {
        return schoolGrade;
    }

    public void setSchoolGrade(Integer schoolGrade) {
        this.schoolGrade = schoolGrade;
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    public String getSchoolIntro() {
        return schoolIntro;
    }

    public void setSchoolIntro(String schoolIntro) {
        this.schoolIntro = schoolIntro;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(String schoolNum) {
        this.schoolNum = schoolNum;
    }

    public Integer getSchoolProvinceId() {
        return schoolProvinceId;
    }

    public void setSchoolProvinceId(Integer schoolProvinceId) {
        this.schoolProvinceId = schoolProvinceId;
    }

    public Integer getSchoolCityId() {
        return schoolCityId;
    }

    public void setSchoolCityId(Integer schoolCityId) {
        this.schoolCityId = schoolCityId;
    }
}
