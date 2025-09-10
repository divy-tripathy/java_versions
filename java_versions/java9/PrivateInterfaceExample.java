package com.java_versions.java9;

public class PrivateInterfaceExample implements MyInterface{
    public static void main(String[] args) {
        PrivateInterfaceExample obj = new PrivateInterfaceExample();
        obj.printHello();
        obj.printWelcome();
    }
}
