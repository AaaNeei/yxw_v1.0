package com.yxw.web.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Author:阿倪
 * @Date: 2019/3/8 10:53
 * @Description:
 * @return:
 * @throws:
 */
@Component
public class JMSConsumer3 {
    private final static Logger logger = LoggerFactory.getLogger(JMSConsumer3.class);

    @JmsListener(destination = JmsConfig.TOPIC,containerFactory = "jmsListenerContainerTopic")
    public void onTopicMessage(String msg) {
        logger.info("接收到topic消息：{}",msg);
    }

    @JmsListener(destination = JmsConfig.QUEUE,containerFactory = "jmsListenerContainerQueue")
    public void onQueueMessage(String msg) {
        logger.info("接收到queue消息：{}",msg);
    }
}
