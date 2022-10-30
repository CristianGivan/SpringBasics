package com.springapp.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Addresses {

    @Bean
    public  String address(){
        return "Str. x, nr 1";
    }

    @Bean
    public  String address1(){
        return "Str. y, nr 1";
    }
}
