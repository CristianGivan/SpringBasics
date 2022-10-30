package com.springapp.demo.PasswordGenerator;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Runner implements CommandLineRunner {

    public PasswordEncoder passwordEncoder;

    public PasswordGenerator passwordGenerator;
    @Autowired
    ApplicationContext applicationContext;

    public Runner(@Autowired PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    @Override
    public void run(String... args) throws Exception {
        String password=passwordGenerator.generatePassword(5);
        System.out.println(password);
        System.out.println(passwordGenerator.encodePassword(password));
        //todo de ce nu asa?
        passwordEncoder.encode(password);
        //System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
