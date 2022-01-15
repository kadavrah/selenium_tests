package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        String text = "Hello World!";
        System.out.println("Hello World!");
        text = "1";
        assertEquals( "Hello World!", text);
    }
}
