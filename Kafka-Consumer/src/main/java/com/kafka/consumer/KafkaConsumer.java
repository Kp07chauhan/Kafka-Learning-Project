package com.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {


    @KafkaListener(topics = {"spring_topic"},groupId = "audit_group")
    public void orderConsumer(String data){
        log.info("Data Consumer for topic: {} with data : {}","audit_group",data);
    }

}
