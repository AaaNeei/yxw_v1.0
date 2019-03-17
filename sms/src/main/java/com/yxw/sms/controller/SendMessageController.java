package com.yxw.sms.controller;

import com.yxw.sms.service.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:阿倪
 * @Date: 2019/3/16 10:08
 * @Description:
 * @return:
 * @throws:
 */
@Controller
@RequestMapping("/yxw")
public class SendMessageController {

    @Autowired
    private SendMessageService sendMessageService;

    @RequestMapping("/sendMessage")
    public String sendMessage(String sendPhoneNum) {
        String message = sendMessageService.sendMessage(sendPhoneNum);
        return message;
    }


}
