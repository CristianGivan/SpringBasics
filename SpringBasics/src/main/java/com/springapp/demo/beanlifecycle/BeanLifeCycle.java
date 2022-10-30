package com.springapp.demo.beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class BeanLifeCycle {

    private List<String> books = new ArrayList<>();
    @PostConstruct
    public void init() {
        books.add("b1");
        books.add("b2");
        System.out.println("Books ware created");
    }
    @PreDestroy
    public void removeBooks(){
        books.clear();
        System.out.println("books were removed");
    }

}
