package com.excercise.chatapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.excercise.chatapp.model.ChatMessage;
import com.excercise.chatapp.service.ChatService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService; //cons inj
    }

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        return chatService.saveMessage(chatMessage);
    }

    @GetMapping("/")
    public String chatPage(Model model) {
        model.addAttribute("message", chatService.getAllMessages());
        return "chat";
    }
}
