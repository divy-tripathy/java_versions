package com.java_versions.java16;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println(rect);       // Rectangle[length=5.0, width=3.0]
        System.out.println(rect.area()); // 15.0
    }
}
