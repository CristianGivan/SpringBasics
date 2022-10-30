package com.springapp.demo.beanscope;

public class Count {
    private static Count instance;

    private Count() {
    }

    public static Count getInstance() {
        if (instance == null) {
            return new Count();
        }
        return instance;
    }

    private Integer counter;

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public void increment() {
        counter++;
    }

    @Override
    public String toString() {
        return "Count{" +
                "counter=" + counter +
                '}';
    }
}
