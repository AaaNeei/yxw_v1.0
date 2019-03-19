package com.yxw.tool.mapper;

import com.yxw.tool.entity.City;
import com.yxw.tool.entity.School;

/**
 * @Author:阿倪
 * @Date: 2019/3/8 20:31
 * @Description:
 * @return:
 * @throws:
 */
public interface CityMapper {
    int insert(City city);
    City selectCityNum(String cityName);
}
