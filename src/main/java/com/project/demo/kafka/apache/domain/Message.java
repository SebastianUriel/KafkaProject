package com.project.demo.kafka.apache.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private Long id;
    private String message;
    private String user;
}
