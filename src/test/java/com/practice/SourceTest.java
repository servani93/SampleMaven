package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SourceTest {

    @Test
    void greetings() {
        Source s = new Source();
        String greet = s.greetings();
        assertEquals("Good Morning",greet);
    }
}