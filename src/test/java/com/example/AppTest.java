package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for App.
 */
class AppTest {

    @Test
    void testGetGreeting() {
        assertEquals("Hello, World!", App.getGreeting());
    }
}
