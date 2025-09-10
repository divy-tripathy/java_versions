package com.java_versions.java14;

public class YieldExample {
    public static void main(String[] args) {
        String day = "MONDAY";

        int result = switch (day) {
            case "MONDAY", "TUESDAY" -> 1;
            case "WEDNESDAY" -> 2;
            default -> {
                System.out.println("Unknown day");
                yield 0;  // ✅ yield returns value from this block
            }
        };

        System.out.println("Result = " + result);
    }
}
