package com.bpi.speedy.test.dao;

import com.bpi.speedy.test.config.KafkaConfig;
import com.bpi.speedy.test.configproperties.KafkaProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Producer {

    @Autowired
    KafkaProps kafkaProps;


    private KafkaTemplate<Integer, String> createTemplate() {
        Map<String, Object> senderProps = kafkaProps.senderProps();
        ProducerFactory<Integer, String> pf =
                new DefaultKafkaProducerFactory<Integer, String>(senderProps);
        KafkaTemplate<Integer, String> template = new KafkaTemplate<>(pf);
        return template;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady(){
//        while(false){
//            KafkaTemplate<Integer, String> kafkaTemplate = createTemplate();
//            kafkaTemplate.send("test",1, "Hello");
//        }
    }
}
