package com.sanokho.springboot.controller;

import com.sanokho.springboot.kafka.JsonKafkaProducer;
import com.sanokho.springboot.model.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    // http://localhost:8080/api/v1/kafka/jsonpublish
    @PostMapping("/jsonpublish")
    public ResponseEntity<String > publish(@RequestBody User user){
        kafkaProducer.sengMessage(user);
        return ResponseEntity.ok("Json message sent to topic");
    }
}
