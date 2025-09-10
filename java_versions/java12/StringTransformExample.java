package com.java_versions.java12;

public class StringTransformExample {
    public static void main(String[] args) {
        String result = " java 12 "
                .transform(String::trim)              // remove spaces
                .transform(String::toUpperCase)       // convert to uppercase
                .transform(s -> new StringBuilder(s).reverse().toString()); // reverse

        System.out.println(result);
    }
}
