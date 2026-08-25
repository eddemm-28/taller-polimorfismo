package edu.unicauca.practice.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testCalculateArea() {
        Square s = new Square(2.0);
        double expected = 4.0; // 2^2
        assertEquals(expected, s.calculateArea(), 1e-9);
    }

    @Test
    void testCalculatePerimeter() {
        Square s = new Square(2.0);
        double expected = 8.0; // 4 * 2
        assertEquals(expected, s.calculatePerimeter(), 1e-9);
    }
}
