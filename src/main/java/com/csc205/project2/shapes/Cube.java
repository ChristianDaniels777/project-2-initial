package com.csc205.project2.shapes;

/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: ChatGPT (GPT-5.1 Thinking)
 * Generation Date: 2026-02-24
 * Original Prompt:
 * "Create a Cube class extending Shape3D with sideLength, validation, and correct
 * volume and surface area formulas."
 * Follow-up Prompts (if any):
 * 1. [Add any refinements here]
 * Manual Modifications:
 * - [Utilizing 'geetSudeLength()' method for Cube implementation]
 * Formula Verification:
 * - Volume formula verified against: V = s^3
 * - Surface area formula verified against: A = 6 * s^2
 */
public class Cube extends Shape3D {

    private double sideLength;

    public Cube() {
        this("Cube", "Uncolored", 1.0);
    }

    public Cube(String name, String color, double sideLength) {
        super(name, color);
        setSideLength(sideLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength < 0.0) {
            throw new IllegalArgumentException("Side length must be non-negative.");
        }
        this.sideLength = sideLength;
    }

    @Override
    protected double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    protected double calculateSurfaceArea() {
        return 6.0 * sideLength * sideLength;
    }

    @Override
    public String toString() {
        return String.format(
                "Cube{name='%s', color='%s', sideLength=%.4f, surfaceArea=%.4f, volume=%.4f}",
                getName(), getColor(), sideLength, getSurfaceArea(), getVolume());
    }
}