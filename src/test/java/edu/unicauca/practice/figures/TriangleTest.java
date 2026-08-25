package edu.unicauca.practice.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testCalculateArea() {
        Triangle t = new Triangle(4.0, 3.0);
        double expected = 6.0; // (4 * 3) / 2
        assertEquals(expected, t.calculateArea(), 1e-9);
    }

    @Test
    void testCalculatePerimeter() {
        // base = 4, altura = 3 → lados iguales = sqrt(2^2 + 3^2) = sqrt(13)
        Triangle t = new Triangle(4.0, 3.0);
        double side = Math.sqrt(2.0 * 2.0 + 3.0 * 3.0);
        double expected = 4.0 + 2 * side;
        assertEquals(expected, t.calculatePerimeter(), 1e-9);
    }
}
