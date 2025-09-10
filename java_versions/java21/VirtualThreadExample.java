package com.java_versions.java21;

public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("Running on: " + Thread.currentThread());
            try {
                Thread.sleep(1000); // Non-blocking with virtual threads
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread vThread = Thread.ofVirtual().start(task); // Start a virtual thread
        vThread.join();
    }
}
