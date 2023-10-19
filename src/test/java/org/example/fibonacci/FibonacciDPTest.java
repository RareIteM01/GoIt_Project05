package org.example.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciDPTest {

    @BeforeEach
    void startTime() {
        System.out.println("Test started at: " + System.currentTimeMillis());
    }

    @AfterEach
    void endTime() {
        System.out.println("Test finished at: " + System.currentTimeMillis());
    }

    @Test
    void testFibonacci() {
        FibonacciDP fibonacciDP = new FibonacciDP();
        int n = 25;

        long result = fibonacciDP.fibonacci(n);

        long expected = 75025;
        assertEquals(expected, result);
    }

    @Test
    void testInputIsZero() {
        FibonacciDP fibonacciDP = new FibonacciDP();
        int n = 0;

        long result = fibonacciDP.fibonacci(n);

        long expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void testInputIsOne() {
        FibonacciDP fibonacciDP = new FibonacciDP();
        int n = 1;

        long result = fibonacciDP.fibonacci(n);

        long expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void testNegativeInput() {
        FibonacciDP fibonacciDP = new FibonacciDP();
        int n = -5;

        assertThrows(IllegalArgumentException.class, () -> fibonacciDP.fibonacci(n));
    }
}