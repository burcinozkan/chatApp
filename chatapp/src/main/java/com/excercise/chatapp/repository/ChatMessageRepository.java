package com.excercise.chatapp.repository;


import com.excercise.chatapp.model.ChatMessage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository {

    private final List<ChatMessage> messages = new ArrayList<>();

    public ChatMessage save(ChatMessage message) {
        messages.add(message);
        return message;
    }

    public List<ChatMessage> getMessages() {
        return messages;
    }

    public void clear() {
        messages.clear();
    }

}
