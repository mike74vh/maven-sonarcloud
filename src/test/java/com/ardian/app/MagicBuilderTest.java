package com.ardian.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicBuilderTest {
    
    @Test
    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }

}
