package com.springapp.demo.Conversation;

public class Conversation {
    private Person per1;
    private Person per2;

    public Conversation(Person per1, Person per2) {
        this.per1 = per1;
        this.per2 = per2;
    }
    public void start(){
        System.out.println(per1.sayHello());
        System.out.println(per2.sayHello());

    }
}
