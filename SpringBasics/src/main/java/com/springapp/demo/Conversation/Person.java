package com.springapp.demo.Conversation;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
    public String sayHello(){
        return "Hello,  my name is " +this.name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
