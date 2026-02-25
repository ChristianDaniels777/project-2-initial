package com.csc205.project2.shapes;

/**
 * Abstract base class for all 3D shapes in this project.
 * It implements the ThreeDimensionalShape interface and
 * provides common state/behavior (name and color).
 */
public abstract class Shape3D implements ThreeDimensionalShape {

    private String name;
    private String color;

    /**
     * Default constructor using generic values.
     */
    public Shape3D() {
        this("Unnamed Shape", "Uncolored");
    }

    /**
     * Constructs a Shape3D with the given name and color.
     *
     * @param name  the logical name of the shape
     * @param color the color description of the shape
     */
    public Shape3D(String name, String color) {
        setName(name);
        setColor(color);
    }

    /**
     * Implemented by concrete shapes to compute their volume.
     *
     * @return volume of the shape
     */
    protected abstract double calculateVolume();

    /**
     * Implemented by concrete shapes to compute their surface area.
     *
     * @return surface area of the shape
     */
    protected abstract double calculateSurfaceArea();

    /**
     * Delegates to the subclass formula.
     */
    @Override
    public double getVolume() {
        return calculateVolume();
    }

    /**
     * Delegates to the subclass formula.
     */
    @Override
    public double getSurfaceArea() {
        return calculateSurfaceArea();
    }

    // ---------- Getters / Setters ----------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Java-8 friendly: use trim().isEmpty() instead of isBlank()
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or blank.");
        }
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // Java-8 friendly: use trim().isEmpty() instead of isBlank()
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color must not be null or blank.");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s{name='%s', color='%s'}",
                getClass().getSimpleName(), name, color);
    }
}