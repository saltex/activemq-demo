package com.example.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqApplication implements CommandLineRunner {

    @Autowired
    private Producer producer;

    public static void main(String[] args) {
        SpringApplication.run(ActivemqApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        producer.sendMessage();
    }
}
