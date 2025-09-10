package com.java_versions.java16;

public record Rectangle(double length, double width) {
    public double area() {
        return length * width;
    }

    // Compact constructor (validation)
    public Rectangle {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }
    }
}
