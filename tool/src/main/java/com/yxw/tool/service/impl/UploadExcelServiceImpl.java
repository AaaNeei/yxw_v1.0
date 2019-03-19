package com.yxw.tool.service.impl;

import com.yxw.tool.entity.*;
import com.yxw.tool.mapper.CityMapper;
import com.yxw.tool.mapper.ProfessionMapper;
import com.yxw.tool.mapper.ProvinceMapper;
import com.yxw.tool.mapper.SchoolMapper;
import com.yxw.tool.service.UploadExcelService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author:阿倪
 * @Date: 2019/3/8 17:32
 * @Description:
 * @return:
 * @throws:
 */
@Service("uploadExcelService")
public class UploadExcelServiceImpl implements UploadExcelService {
    @Autowired
    private ProfessionMapper professionMapper;
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public String readExcelFile(MultipartFile file) {
        String result = "";
        //创建处理EXCEL的类  
        ReadExcel readExcel = new ReadExcel();
        //解析excel，获取上传的事件单  
        List<User> useList = readExcel.getExcelInfo(file);
        int count = 0;
        for (User user : useList) {
            count++;
            System.out.println("truncate  TABLE " + user.getName()+";");


            /*Profession profession = new Profession();
            profession.setProfessionName(user.getName());
            profession.setProfessionCategory(user.getDepId());
            profession.setProfessionNum(user.getNumber());
            System.out.println("插入第" + count + "条");

            professionMapper.insert(profession);
*/
            //省份
           /* Province province = new Province();
            province.setProvinceName(user.getName());
            province.setProvinceNum(Integer.getInteger(user.getNumber()));
            province.setProvinceShort(user.getDepId());
            provinceMapper.insert(province);*/
            //市
           /* City city = new City();
            city.setCityName(user.getName());
            city.setCityNum(Integer.valueOf(user.getNumber()));
            city.setProvinceNum(Integer.valueOf(user.getDepId()));
            cityMapper.insert(city);*/
            //高校
/*            School school= new School();
            City city = cityMapper.selectCityNum(user.getDepId());
            school.setSchoolNum(user.getName());
            school.setSchoolName(user.getNumber());
            if(city==null){
                school.setSchoolCityId(0);
                school.setSchoolProvinceId(0);
            }else {
                if(city.getCityNum()==null){
                    school.setSchoolCityId(0);
                }else {
                    school.setSchoolCityId(city.getCityNum());
                }if(city.getProvinceNum()==null){
                    school.setSchoolProvinceId(0);
                }else {
                    school.setSchoolProvinceId(city.getProvinceNum());
                }
            }

            schoolMapper.insert(school);*/


        }


        //至此已经将excel中的数据转换到list里面了,接下来就可以操作list,可以进行保存到数据库,或者其他操作,  
        //和你具体业务有关,这里不做具体的示范  
        if (useList != null && !useList.isEmpty()) {
            result = "上传成功";
        } else {
            result = "上传失败";
        }
        return result;

    }
}
