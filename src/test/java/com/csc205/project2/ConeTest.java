package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConeTest {

    private static final double EPSILON = 1e-6;

    @Test
    void testConstructorAndGetters() {
        Cone cone = new Cone("Traffic Cone", "Orange", 2.0, 5.0);

        assertEquals("Traffic Cone", cone.getName());
        assertEquals("Orange", cone.getColor());
        assertEquals(2.0, cone.getRadius(), EPSILON);
        assertEquals(5.0, cone.getHeight(), EPSILON);
    }

    @Test
    void testVolumeCalculation() {
        Cone cone = new Cone("Traffic Cone", "Orange", 2.0, 5.0);
        double expected = (1.0 / 3.0) * Math.PI * 2.0 * 2.0 * 5.0;
        assertEquals(expected, cone.getVolume(), EPSILON);
    }

    @Test
    void testSurfaceAreaCalculation() {
        Cone cone = new Cone("Traffic Cone", "Orange", 2.0, 5.0);
        double slantHeight = Math.sqrt(2.0 * 2.0 + 5.0 * 5.0);
        double expected = Math.PI * 2.0 * (2.0 + slantHeight);
        assertEquals(expected, cone.getSurfaceArea(), EPSILON);
    }

    @Test
    void testNegativeRadiusThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cone("BadCone", "Red", -1.0, 3.0));
    }

    @Test
    void testNegativeHeightThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cone("BadCone", "Red", 1.0, -3.0));
    }

    @Test
    void testPolymorphismWithShape3D() {
        Shape3D shape = new Cone("PolyCone", "Yellow", 1.0, 1.0);
        double expected = (1.0 / 3.0) * Math.PI * 1.0 * 1.0 * 1.0;
        assertEquals(expected, shape.getVolume(), EPSILON);
    }
}