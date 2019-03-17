package com.yxw.sms.service;

import com.yxw.sms.util.SendMessageUtil;

import java.util.concurrent.TimeUnit;

/**
 * @Author:阿倪
 * @Date: 2019/3/16 10:10
 * @Description:
 * @return:
 * @throws:
 */
public interface SendMessageService {
    //发送短信
    public String sendMessage(String sendPhoneNum);

}
