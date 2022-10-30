package com.springapp.demo.beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CounterConfig {

    @Bean
    @Scope("prototype")
    public Count counter() {
        return Count.getInstance();
    }
}
