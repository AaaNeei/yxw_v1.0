package com.yxw.sms;

import com.yxw.sms.util.SendMessageUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(SmsApplicationTests.class);
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 生成随机数
     * @param num 位数
     * @return
     */
    public static String createRandomNum(int num){
        String randomNumStr = "";
        for(int i = 0; i < num;i ++){
            int randomNum = (int)(Math.random() * 10);
            randomNumStr += randomNum;
        }
        return randomNumStr;
    }

    /**
     * 中国网建 SMS短信
     */
    @Test
    public void sendMessage(){
        int timeout = 5;
        String code = createRandomNum(6);
        String sendPhoneNum = "";
        Integer resultCode = SendMessageUtil.send("AaNeei","d41d8cd98f00b204e980",sendPhoneNum,"尊敬的用户，您好，您正在注册**，您的验证码为："+code+"，请于"+timeout+"分钟内正确输入，如非本人操作，请忽略此短信。");
        if (resultCode>0){
            //手机验证码发送成功。验证码存入Redis缓存
            redisTemplate.opsForValue().set("yxw_sms_code:"+sendPhoneNum,code);
            redisTemplate.expire(sendPhoneNum,5, TimeUnit.MINUTES);
        }

        System.out.println("已发送至："+sendPhoneNum+"，验证码："+redisTemplate.opsForValue().get(sendPhoneNum));
        System.out.println(SendMessageUtil.getMessage(resultCode));
    }

}
