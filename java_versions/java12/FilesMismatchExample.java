package com.java_versions.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatchExample {
    public static void main(String[] args) throws IOException {
        Path file1 = Files.writeString(Files.createTempFile("file1", ".txt"), "Hello Java 12");
        Path file2 = Files.writeString(Files.createTempFile("file2", ".txt"), "Hello Java 13");

        long result = Files.mismatch(file1, file2);

        if (result == -1L) {
            System.out.println("Files are identical");
        } else {
            System.out.println("Files differ at byte position: " + result);
        }
    }
}
