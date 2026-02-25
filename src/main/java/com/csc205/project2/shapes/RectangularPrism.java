package com.csc205.project2.shapes;

/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: ChatGPT (GPT-5.1 Thinking)
 * Generation Date: 2026-02-24
 * Original Prompt:
 * "Implement a RectangularPrism class extending Shape3D with length, width, height,
 * validation, and the correct 3D formulas."
 * Follow-up Prompts (if any):
 * 1. [Add refinements here if used]
 * Manual Modifications:
 * - [Manually added bug fixes to get rectangular prism to widen]
 * Formula Verification:
 * - Volume formula verified against: V = l * w * h
 * - Surface area formula verified against: A = 2 * (lw + lh + wh)
 */
public class RectangularPrism extends Shape3D {

    private double length;
    private double width;
    private double height;

    public RectangularPrism() {
        this("Rectangular Prism", "Uncolored", 1.0, 1.0, 1.0);
    }

    public RectangularPrism(String name, String color,
                            double length, double width, double height) {
        super(name, color);
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0) {
            throw new IllegalArgumentException("Length must be non-negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0) {
            throw new IllegalArgumentException("Width must be non-negative.");
        }
        this.width = width;
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
        return length * width * height;
    }

    @Override
    protected double calculateSurfaceArea() {
        return 2.0 * (length * width + length * height + width * height);
    }

    @Override
    public String toString() {
        return String.format(
                "RectangularPrism{name='%s', color='%s', length=%.4f, width=%.4f, height=%.4f, surfaceArea=%.4f, volume=%.4f}",
                getName(), getColor(), length, width, height, getSurfaceArea(), getVolume());
    }
}