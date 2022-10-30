package com.springapp.demo.PasswordGenerator;

import com.springapp.demo.Conversation.Conversation;
import com.springapp.demo.Conversation.ConversationApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordGeneratorDemo {

    public static void main(String[] args) {
        SpringApplication.run(PasswordGeneratorDemo.class, args);
    }

}
