package edu.unicauca.practice.figures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void testCalculateArea() {
        Circle c = new Circle(1.0);
        double expected = Math.PI; // π * 1^2
        assertEquals(expected, c.calculateArea(), 1e-9);
    }

    @Test
    void testCalculatePerimeter() {
        Circle c = new Circle(1.0);
        double expected = 2 * Math.PI;
        assertEquals(expected, c.calculatePerimeter(), 1e-9);
    }
}
