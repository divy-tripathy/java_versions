package com.java_versions.java9;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        try (fis; fos) {  // use both declared resources
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully!");
        }
    }
}
