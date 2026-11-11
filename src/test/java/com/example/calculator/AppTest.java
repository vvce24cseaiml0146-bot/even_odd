
package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", App.checkEvenOdd(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", App.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", App.checkEvenOdd(0));
    }
}
