package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularPrismTest {

    private static final double EPSILON = 1e-6;

    @Test
    void testConstructorAndGetters() {
        RectangularPrism prism =
                new RectangularPrism("Crate", "Brown", 3.0, 4.0, 5.0);

        assertEquals("Crate", prism.getName());
        assertEquals("Brown", prism.getColor());
        assertEquals(3.0, prism.getLength(), EPSILON);
        assertEquals(4.0, prism.getWidth(), EPSILON);
        assertEquals(5.0, prism.getHeight(), EPSILON);
    }

    @Test
    void testVolumeCalculation() {
        RectangularPrism prism =
                new RectangularPrism("Crate", "Brown", 3.0, 4.0, 5.0);
        double expected = 3.0 * 4.0 * 5.0;
        assertEquals(expected, prism.getVolume(), EPSILON);
    }

    @Test
    void testSurfaceAreaCalculation() {
        RectangularPrism prism =
                new RectangularPrism("Crate", "Brown", 3.0, 4.0, 5.0);
        double expected = 2.0 * (3.0 * 4.0 + 3.0 * 5.0 + 4.0 * 5.0);
        assertEquals(expected, prism.getSurfaceArea(), EPSILON);
    }

    @Test
    void testNegativeDimensionThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new RectangularPrism("Bad", "Red", -1.0, 2.0, 3.0));
        assertThrows(IllegalArgumentException.class,
                () -> new RectangularPrism("Bad", "Red", 1.0, -2.0, 3.0));
        assertThrows(IllegalArgumentException.class,
                () -> new RectangularPrism("Bad", "Red", 1.0, 2.0, -3.0));
    }

    @Test
    void testPolymorphismWithThreeDimensionalShape() {
        ThreeDimensionalShape shape =
                new RectangularPrism("PolyPrism", "Gray", 1.0, 2.0, 3.0);
        assertEquals(6.0, shape.getVolume(), EPSILON);
    }
}