package com.example.topic.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsSubscriber {

    @JmsListener(destination = "${example.topic}")
    public void receive(String text) {
        System.out.println("Received Message: " + text);
    }

}
