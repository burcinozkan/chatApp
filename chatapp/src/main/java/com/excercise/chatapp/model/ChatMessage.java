package com.excercise.chatapp.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChatMessage {


    private Long messageId;
    private String content;
    private String sender;
    private LocalDateTime date;


}
