package com.springapp.demo.PasswordGenerator;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "1234567890";

    @Bean
    public PasswordAlphabet allCharacters() {
        return new PasswordAlphabet(CHARACTERS+NUMBERS);
    }
    @Bean
    public PasswordAlphabet numericCharacters(){
        return new PasswordAlphabet(NUMBERS);
    }
    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

}
