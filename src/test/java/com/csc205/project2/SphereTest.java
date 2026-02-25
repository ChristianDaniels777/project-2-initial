package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    private static final double EPSILON = 1e-6;

    @Test
    void testConstructorAndGetters() {
        Sphere sphere = new Sphere("Ball", "Red", 3.0);

        assertEquals("Ball", sphere.getName());
        assertEquals("Red", sphere.getColor());
        assertEquals(3.0, sphere.getRadius(), EPSILON);
    }

    @Test
    void testSetters() {
        Sphere sphere = new Sphere();
        sphere.setName("MySphere");
        sphere.setColor("Green");
        sphere.setRadius(2.5);

        assertEquals("MySphere", sphere.getName());
        assertEquals("Green", sphere.getColor());
        assertEquals(2.5, sphere.getRadius(), EPSILON);
    }

    @Test
    void testVolumeCalculation() {
        Sphere sphere = new Sphere("Ball", "Red", 3.0);
        double expected = (4.0 / 3.0) * Math.PI * Math.pow(3.0, 3);
        assertEquals(expected, sphere.getVolume(), EPSILON);
    }

    @Test
    void testSurfaceAreaCalculation() {
        Sphere sphere = new Sphere("Ball", "Red", 3.0);
        double expected = 4.0 * Math.PI * 3.0 * 3.0;
        assertEquals(expected, sphere.getSurfaceArea(), EPSILON);
    }

    @Test
    void testNegativeRadiusThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Sphere("Bad", "Red", -1.0));
    }

    @Test
    void testPolymorphismWithShape3D() {
        Shape3D shape = new Sphere("PolySphere", "Blue", 4.0);
        double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(4.0, 3);
        assertEquals(expectedVolume, shape.getVolume(), EPSILON);
    }
}