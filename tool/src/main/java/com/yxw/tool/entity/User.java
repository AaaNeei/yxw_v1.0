package com.yxw.tool.entity;

/**
 * @Author:阿倪
 * @Date: 2019/3/8 17:43
 * @Description:
 * @return:
 * @throws:
 */
public class User {

    private String name;
    private String number;
    private String depId;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
