package com.example.topic.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class TopicPublisher {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${example.topic}")
    String topic;

    public void send(String text) {
        jmsTemplate.convertAndSend(topic, text);
    }

}
