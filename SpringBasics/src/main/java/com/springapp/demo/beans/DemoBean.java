package com.springapp.demo.beans;

import com.springapp.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoBean implements CommandLineRunner {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        System.out.println(applicationContext.getBean("customer"));
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public Customer customer(@Qualifier( "address1") String addresses) {
        return new Customer("n1", addresses);
    }

    @Bean
    public Customer temporary(Customer customer) {
        System.out.println(customer);
        return customer;
    }
}
