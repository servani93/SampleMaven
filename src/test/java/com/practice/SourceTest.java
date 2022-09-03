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

    @Test
    void addition() {
        Source s = new Source();
        int result = s.addition(5, 8);
        assertEquals(13, result);
    }

    @Test
    void subtraction() {
        Source s = new Source();
        int result = s.subtraction(5, 8);
        assertEquals(-3, result);


    }

    @Test
    void multiplication() {
        Source s = new Source();
        int result = s.multiplication(5, 8);
        assertEquals(40, result);
    }
}