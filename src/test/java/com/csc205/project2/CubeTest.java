package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    private static final double EPSILON = 1e-6;

    @Test
    void testConstructorAndGetters() {
        Cube cube = new Cube("Box", "Blue", 4.0);

        assertEquals("Box", cube.getName());
        assertEquals("Blue", cube.getColor());
        assertEquals(4.0, cube.getSideLength(), EPSILON);
    }

    @Test
    void testVolumeCalculation() {
        Cube cube = new Cube("Box", "Blue", 4.0);
        double expected = Math.pow(4.0, 3);
        assertEquals(expected, cube.getVolume(), EPSILON);
    }

    @Test
    void testSurfaceAreaCalculation() {
        Cube cube = new Cube("Box", "Blue", 4.0);
        double expected = 6.0 * 4.0 * 4.0;
        assertEquals(expected, cube.getSurfaceArea(), EPSILON);
    }

    @Test
    void testNegativeSideThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cube("BadCube", "Red", -2.0));
    }

    @Test
    void testPolymorphismWithThreeDimensionalShape() {
        ThreeDimensionalShape shape = new Cube("PolyCube", "Gray", 2.0);
        assertEquals(8.0, shape.getVolume(), EPSILON);
    }
}