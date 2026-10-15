package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceTest {

    @Test
    void shouldGreetUser() {
        HelloService service = new HelloService();

        assertEquals("Hello, Alice", service.greet("Alice"));
    }
}