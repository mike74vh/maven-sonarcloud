package com.ardian.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageBuilderTest {

    @Test
    public void testHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        assertEquals(10, MessageBuilder.getNumber10());
    }
    
}