package com.java_versions.java16;

public class RecordExample {
    public static void main(String[] args) {
        Person p1 = new Person("Divy", 25);
        Person p2 = new Person("Divy", 25);

        System.out.println(p1);              // Person[name=Divy, age=25]
        System.out.println(p1.name());       // Divy
        System.out.println(p1.age());        // 25
        System.out.println(p1.equals(p2));   // true
    }
}
