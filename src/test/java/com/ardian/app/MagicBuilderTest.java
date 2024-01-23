package com.ardian.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MagicBuilderTest {
    
    @Test
    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }

    @Test
    public void testUnlucky() {
        assertEquals(13, MagicBuilder.getUnlucky());
    }

}
