package com.yxw.web.mq;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @Author:阿倪
 * @Date: 2019/3/8 10:51
 * @Description:
 * @return:
 * @throws:
 */
public class TestMq {
    @Autowired
    private JMSProducer jmsProducer;

    @Test
    public void testJms() {
        Destination destination = new ActiveMQQueue("springboot.queue.test");
        for (int i = 0; i < 10; i++) {
            jmsProducer.sendMessage(destination, "hello,world!" + i);
        }
    }


    @Autowired
    private Topic topic;
    @Autowired
    private Queue queue;

    @Test
    public void testJms2() {
        for (int i = 0; i < 10; i++) {
            jmsProducer.sendMessage(queue, "queue,world!" + i);
            jmsProducer.sendMessage(topic, "topic,world!" + i);
        }
    }
}
