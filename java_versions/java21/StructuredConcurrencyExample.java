package com.java_versions.java21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            StructuredTaskScope.Subtask<String> user = scope.fork(() -> findUser());
            StructuredTaskScope.Subtask<Integer> order = scope.fork(() -> fetchOrders());

            scope.join();   // wait for all tasks
            scope.throwIfFailed(); // rethrow if any failed

            System.out.println("User: " + user.get());
            System.out.println("Orders: " + order.get());
        }
    }

    static String findUser() throws InterruptedException {
        Thread.sleep(500);
        return "Divy";
    }

    static int fetchOrders() throws InterruptedException {
        Thread.sleep(1000);
        return 5;
    }
}
