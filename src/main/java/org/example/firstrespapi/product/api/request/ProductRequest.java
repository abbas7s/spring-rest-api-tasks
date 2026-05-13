package org.example.firstrespapi.product.api.request;

public class ProductRequest {

    private final String name;

    public ProductRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
