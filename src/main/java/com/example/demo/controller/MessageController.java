package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/messages")
@RestController
public class MessageController {
    @Autowired
    MessageService messageService;
    @GetMapping
    public List<Message> listAll(){
        return messageService.listMessages();
    }
    @PostMapping("/add")
    public Message postMessage(@RequestBody Message message){
        return messageService.createMessage(message);
    }
    @PutMapping("/update/{id}")
    public Message editMessage(@RequestBody Message message, @PathVariable Integer id){
        return messageService.editMessageById(message,id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteMessage(@PathVariable Integer id){
        messageService.deleteById(id);
    }

}
