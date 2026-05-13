package org.example.firstrespapi.product.api;

import org.example.firstrespapi.product.api.request.ProductRequest;
import org.example.firstrespapi.product.api.response.ProductResponse;
import org.example.firstrespapi.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> create(
            @RequestBody ProductRequest productRequest
    ) {

        ProductResponse productResponse =
                productService.create(productRequest);

        return new ResponseEntity<>(
                productResponse,
                HttpStatus.CREATED
        );
    }
}
