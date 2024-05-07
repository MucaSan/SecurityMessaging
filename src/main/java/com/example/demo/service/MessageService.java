package com.example.demo.service;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    public List<Message> listMessages(){
        return messageRepository.findAll();
    }
    public Message createMessage(Message message){
        return messageRepository.save(message);
    }
    public void deleteById(Integer id){
        messageRepository.deleteById(id);
    }
    public Message editMessageById(Message message, Integer id){
        Message newMessage = messageRepository.findById(id).orElseGet(null);
        if(newMessage==null){
            newMessage.setBody(message.getBody());
            newMessage.setTitle(message.getTitle());
            newMessage.setIdUser(message.getIdUser());
            return newMessage;
        }
        return null;
    }
}
