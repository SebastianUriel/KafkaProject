package com.project.demo.kafka.apache.adapter.controller.model;

import com.project.demo.kafka.apache.domain.Message;
import lombok.Data;

@Data
public class MessageRequest {
    private Long id;
    private String message;
    private String user;

    public Message toDomain() {
        return Message.builder()
                .id(id)
                .message(message)
                .user(user)
                .build();
    }
}
