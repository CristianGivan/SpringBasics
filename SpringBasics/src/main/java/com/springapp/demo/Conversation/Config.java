package com.springapp.demo.Conversation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Person person1(){
        return new Person("George");
    }
    @Bean
    public Person person2(){
        return new Person("Geta");
    }
    @Bean
    public Conversation conversation(@Qualifier("person1") Person person1,@Qualifier("person2") Person person2){
        return new Conversation(person1,person2);
    }
}
