package com.springapp.demo.Conversation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversationApp implements CommandLineRunner {

    @Autowired
    Conversation conversation;

    @Override
    public void run(String... args) throws Exception {

        //Conversation conversation=new Conversation(new Person("Ion"),new Person("Maria"));
        conversation.start();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConversationApp.class, args);
    }

}
