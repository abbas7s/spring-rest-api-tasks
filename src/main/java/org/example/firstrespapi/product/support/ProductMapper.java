package org.example.firstrespapi.product.support;

import org.example.firstrespapi.product.api.request.ProductRequest;
import org.example.firstrespapi.product.api.response.ProductResponse;
import org.example.firstrespapi.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {

        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product) {

        return new ProductResponse(product.getId(), product.getName());
    }
}
