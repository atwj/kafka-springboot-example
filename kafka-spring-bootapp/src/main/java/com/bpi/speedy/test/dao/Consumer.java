package com.bpi.speedy.test.dao;

import com.bpi.speedy.test.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    KafkaConfig kafkaProps;

    @KafkaListener(id="myListener",  topics = "test")
    public void listen(String data){
        System.out.println(data);
    }


}
