package com.java_versions.java10;

import java.util.HashMap;
import java.util.List;

public class VarExample {
    public static void main(String[] args) {
        var message = "Hello, Java 10!";
        var number = 100;
        var data = new HashMap<String, List<Integer>>();

        System.out.println(message);
        System.out.println(number);
        System.out.println(data);

        List<String> names = List.of("Divy", "Alex", "Sam");

        for (var name : names) {
            System.out.println(name.toUpperCase());
        }
    }
}
