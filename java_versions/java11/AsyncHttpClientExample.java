package com.java_versions.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpClientExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/2"))
                .build();

        // Send async request
        CompletableFuture<HttpResponse<String>> future =
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        // Non-blocking
        future.thenAccept(response -> {
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        });

        System.out.println("Request sent asynchronously...");

        // Keep program alive for async task
        future.join();
    }
}
