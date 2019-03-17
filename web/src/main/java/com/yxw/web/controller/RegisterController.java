package com.yxw.web.controller;

import com.yxw.web.entity.Province;
import com.yxw.web.entity.School;
import com.yxw.web.entity.Student;
import com.yxw.web.service.ProvinceService;
import com.yxw.web.service.SchoolService;
import com.yxw.web.service.StudentService;
import com.yxw.web.utils.security.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:阿倪
 * @Date: 2019/3/7 20:59
 * @Description:
 * @return:
 * @throws:
 */
@Controller
@RequestMapping("/student")
public class RegisterController {


    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private SchoolService schoolService;
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerView(Model model, HttpServletRequest request) {

        //查询所有省信息
        List<Province> provinceList = provinceService.selectAllProvince();
        model.addAttribute("provinceList", provinceList);

        return "/register";
    }

    /**
     * @param provinceNum 异步获取省份对应的高校信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "register_getSchoolByProvinceNum.json", method = RequestMethod.GET)
    public List<School> getSchoolByProvinceNum(@RequestParam(value = "provinceNum") Integer provinceNum) {

        List<School> schoolList = schoolService.getSchoolByProvinceNum(provinceNum);

        return schoolList;
    }

    @RequestMapping(value = "/registerIn", method = RequestMethod.POST)
    public String register(Student student) {
        System.out.print("----------注册数据提交");
        student.setStuPassword(MD5Util.encode(student.getStuPassword()));
        studentService.addUser(student);


        return "/login";
    }

    @ResponseBody
    @RequestMapping(value = "/ajaxCheckStuUsername.json", method = RequestMethod.POST)
    public String ajaxCheckStuUsername(String stuUsername) {
        Student student = studentService.ajaxCheckStuUsername(stuUsername);
        if (student != null) {
            return "1";
        }

        return "0";
    }


   /* @ResponseBody
    @RequestMapping("/register")
    public Msg Register(String name,String password) {
        //判断该用户名是否已被注册
        boolean num = userService.userRegister(name);

        if (num == false) {
            Map<String, Object> map2 = new HashMap<String, Object>();
            map2.put("username", "用户名已被注册");
            return Msg.error().add("map", map2);
        } else {
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            //新注册用户错误次数都为0
            user.setMissNumber(0);
            //1超级管理员:直接修改数据库的用户，只能打开mySQL改的
            //2普通会员:通过请求注册的用户
            user.setRoleId(2);
            int flag = userService.userInsert(user);

            if (flag==1) {
                return Msg.success();
            } else {
                return Msg.error();
            }
        }
    }*/


}
