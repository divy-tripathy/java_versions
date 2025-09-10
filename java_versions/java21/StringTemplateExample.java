package com.java_versions.java21;

public class StringTemplateExample {
    public static void main(String[] args) {
        String name = "Divy";
        int age = 25;

        String message = STR."Hello, my name is \{name} and I am \{age} years old.";
        System.out.println(message);
    }
}
