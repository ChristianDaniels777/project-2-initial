package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    private static final double EPSILON = 1e-6;

    @Test
    void testConstructorAndGetters() {
        Cylinder cylinder = new Cylinder("Can", "Silver", 2.0, 5.0);

        assertEquals("Can", cylinder.getName());
        assertEquals("Silver", cylinder.getColor());
        assertEquals(2.0, cylinder.getRadius(), EPSILON);
        assertEquals(5.0, cylinder.getHeight(), EPSILON);
    }

    @Test
    void testVolumeCalculation() {
        Cylinder cylinder = new Cylinder("Can", "Silver", 2.0, 5.0);
        double expected = Math.PI * 2.0 * 2.0 * 5.0;
        assertEquals(expected, cylinder.getVolume(), EPSILON);
    }

    @Test
    void testSurfaceAreaCalculation() {
        Cylinder cylinder = new Cylinder("Can", "Silver", 2.0, 5.0);
        double expected = 2.0 * Math.PI * 2.0 * (2.0 + 5.0);
        assertEquals(expected, cylinder.getSurfaceArea(), EPSILON);
    }

    @Test
    void testNegativeRadiusThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cylinder("Bad", "Red", -1.0, 3.0));
    }

    @Test
    void testNegativeHeightThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cylinder("Bad", "Red", 1.0, -3.0));
    }

    @Test
    void testPolymorphismWithShape3D() {
        Shape3D shape = new Cylinder("PolyCylinder", "Black", 1.0, 1.0);
        double expected = Math.PI * 1.0 * 1.0 * 1.0;
        assertEquals(expected, shape.getVolume(), EPSILON);
    }
}