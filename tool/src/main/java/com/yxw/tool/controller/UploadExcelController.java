package com.yxw.tool.controller;

import com.yxw.tool.service.UploadExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:阿倪
 * @Date: 2019/3/8 17:16
 * @Description:
 * @return:
 * @throws:
 */
@Controller
@RequestMapping("/user")
public class UploadExcelController {


    @Autowired
    private UploadExcelService uploadExcelService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest
            request, HttpServletResponse response) {
        String result = uploadExcelService.readExcelFile(file);
        return result;
    }

    @RequestMapping("/hello")
    public String index1() {

        return "/up";
    }
}



