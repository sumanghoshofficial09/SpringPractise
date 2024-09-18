package com.example.appprops.appprops.component;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MultipicationTest {
    private Multipication multipication = new Multipication();

    @Test
    public void shouldMatchSign()
    {
        assertTrue(multipication.handle('*'));
        assertFalse(multipication.handle('/'));
        
    }

    @Test
    public void shouldCorrectApplyFormulae()
    {
        assertEquals(4, multipication.apply(2, 2));
        
        assertEquals(6, multipication.apply(2, 3));

        assertEquals(12, multipication.apply(3, 4));
    }
    
}
