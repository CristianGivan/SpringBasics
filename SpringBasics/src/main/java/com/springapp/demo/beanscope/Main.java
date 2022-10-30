package com.springapp.demo.beanscope;

public class Main {
    public static void main(String[] args) {
        Count counter =Count.getInstance();
        counter.setCounter(10);
        counter.increment();
        System.out.println(counter);
    }
}
