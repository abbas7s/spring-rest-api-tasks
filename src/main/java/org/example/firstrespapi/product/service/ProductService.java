package org.example.firstrespapi.product.service;

import org.example.firstrespapi.product.api.request.ProductRequest;
import org.example.firstrespapi.product.api.response.ProductResponse;
import org.example.firstrespapi.product.domain.Product;
import org.example.firstrespapi.product.repository.ProductRepository;
import org.example.firstrespapi.product.support.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository,
                          ProductMapper productMapper) {

        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {

        Product product =
                productRepository.save(
                        productMapper.toProduct(productRequest)
                );

        return productMapper.toProductResponse(product);
    }
}
