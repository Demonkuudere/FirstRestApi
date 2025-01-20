package com.example.firstrestapi.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super(String.format("Product with id %d not found", id));

//Using + in output sentences is not good practice as its better for maths overall.

    }
}
