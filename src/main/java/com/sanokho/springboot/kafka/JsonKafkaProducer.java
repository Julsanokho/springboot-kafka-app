package com.sanokho.springboot.kafka;

import com.sanokho.springboot.model.User;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JsonKafkaProducer {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;


    public void sengMessage(User data){

        LOGGER.info(String.format("Message sent %s", data.toString()));

        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "selftuts_json")
                .build();


        kafkaTemplate.send(message);
    }
}
