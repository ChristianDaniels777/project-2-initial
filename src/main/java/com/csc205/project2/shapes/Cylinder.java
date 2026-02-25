package com.csc205.project2.shapes;

/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: ChatGPT (GPT-5.1 Thinking)
 * Generation Date: 2026-02-24
 * Original Prompt:
 * "Write a Cylinder class extending Shape3D, with radius and height fields,
 * input validation, and the standard volume and surface area formulas."
 * Follow-up Prompts (if any):
 * Manual Modifications:
 * - [Class 'Cylinder' 'getHeight()']
 * Formula Verification:
 * - Volume formula verified against: V = π * r^2 * h
 * - Surface area formula verified against: A = 2 * π * r * (r + h)
 */
public class Cylinder extends Shape3D {

    private double radius;
    private double height;

    public Cylinder() {
        this("Cylinder", "Uncolored", 1.0, 1.0);
    }

    public Cylinder(String name, String color, double radius, double height) {
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
        return Math.PI * radius * radius * height;
    }

    @Override
    protected double calculateSurfaceArea() {
        return 2.0 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return String.format(
                "Cylinder{name='%s', color='%s', radius=%.4f, height=%.4f, surfaceArea=%.4f, volume=%.4f}",
                getName(), getColor(), radius, height, getSurfaceArea(), getVolume());
    }
}