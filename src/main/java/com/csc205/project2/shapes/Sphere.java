package com.csc205.project2.shapes;

/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: ChatGPT (GPT-5.1 Thinking)
 * Generation Date: 2026-02-24
 * Original Prompt:
 * "Generate a Sphere class that extends Shape3D (which implements ThreeDimensionalShape)
 * with radius, constructors, validation, and correct volume/surface area formulas.
 * Follow-up Prompts (if any):
 * Manual Modifications:
 * - [Initializing Sphere class through ShapeDriver]
 * Formula Verification:
 * - Volume formula verified against: standard geometry reference (V = 4/3 * π * r^3)
 * - Surface area formula verified against: standard geometry reference (A = 4 * π * r^2)
 */
public class Sphere extends Shape3D {

    private double radius;

    public Sphere() {
        this("Sphere", "Uncolored", 1.0);
    }

    public Sphere(String name, String color, double radius) {
        super(name, color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0.0) {
            throw new IllegalArgumentException("Radius must be non-negative.");
        }
        this.radius = radius;
    }

    @Override
    protected double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    protected double calculateSurfaceArea() {
        return 4.0 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Sphere{name='%s', color='%s', radius=%.4f, surfaceArea=%.4f, volume=%.4f}",
                getName(), getColor(), radius, getSurfaceArea(), getVolume());
    }
}