package com.Alfreq.springboot;

public class Printablee {
    private String value;
    public Printablee(String value) {
        this.value=value;
    }

    public String greeting() {
        return "Hello from " + value;
    }
}
