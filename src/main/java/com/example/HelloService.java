package com.example;

public class HelloService {

    public String greet1(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        HelloService service = new HelloService();
        System.out.println(service.greet1("Eclipse"));
    }
}