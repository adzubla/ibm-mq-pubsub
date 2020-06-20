package com.example.topic.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicSubscriber {

    @JmsListener(destination = "${example.topic}", containerFactory = "topicConnectionFactory")
    public void receive(String text) {
        System.out.println("Received from topic: " + text);
    }

}
