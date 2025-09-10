package com.java_versions.java12;

public class StringIndentExample {
    public static void main(String[] args) {
        String text = "Hello\nJava 12\nString indent";

        System.out.println("Original:");
        System.out.println(text);

        System.out.println("\nIndented by 4:");
        System.out.println(text.indent(4));

        System.out.println("\nIndented by -2 (remove spaces):");
        String textWithSpaces = "    Line1\n    Line2";
        System.out.println(textWithSpaces.indent(-2));
    }
}
