package com.csc205.project2.shapes;

/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: ChatGPT (GPT-5.1 Thinking)
 * Generation Date: 2026-02-24
 * Original Prompt:
 * "Added a Cone 3D shape for the as 'your choice' requirement. It should extend Shape3D
 * with radius and height, validate input, and use the standard cone formulas."
 * Follow-up Prompts (if any):
 * Manual Modifications:
 * - [Cone utilizes certain double measurement classes for accuracy]
 * Formula Verification:
 * - Volume formula verified against: V = (1/3) * π * r^2 * h
 * - Surface area formula verified against: A = π * r * (r + sqrt(r^2 + h^2))
 */
public class Cone extends Shape3D {

    private double radius;
    private double height;

    public Cone() {
        this("Cone", "Uncolored", 1.0, 1.0);
    }

    public Cone(String name, String color, double radius, double height) {
        super(name, color);
        setRadius(radius);
        setHeight(height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0.0) {
            throw new IllegalArgumentException("Height must be non-negative.");
        }
        this.height = height;
    }

    @Override
    protected double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    protected double calculateSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public String toString() {
        return String.format(
                "Cone{name='%s', color='%s', radius=%.4f, height=%.4f, surfaceArea=%.4f, volume=%.4f}",
                getName(), getColor(), radius, height, getSurfaceArea(), getVolume());
    }
}