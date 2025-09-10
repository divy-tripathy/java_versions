package com.java_versions.java21;

public class ManyVirtualThreads {
    public static void main(String[] args) {
        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10_000; i++) {
                int taskId = i;
                executor.submit(() -> {
                    Thread.sleep(1000); // Virtual thread blocks independently
                    System.out.println("Task " + taskId + " completed by " + Thread.currentThread());
                    return null;
                });
            }
        } // Executor auto-closes and waits for tasks
    }
}
