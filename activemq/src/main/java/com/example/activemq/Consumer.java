package com.example.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class Consumer {

    @JmsListener(destination = "physical.q1")
    public void receiveMessageX2(String message) throws JMSException {
        System.out.println("X3 Received message " + message);
    }

    @JmsListener(destination = "physical.q2")
    public void receiveMessageX3(String message) throws JMSException {
        System.out.println("X2 Received message " + message);
    }
}
