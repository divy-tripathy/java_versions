package com.java_versions.java9;

public interface MyInterface {
    default void printHello() {
        sayMessage("Hello");
    }

    default void printWelcome() {
        sayMessage("Welcome");
    }

    // Private helper method (used by default methods only)
    private void sayMessage(String msg) {
        System.out.println("Message: " + msg);
    }
}
