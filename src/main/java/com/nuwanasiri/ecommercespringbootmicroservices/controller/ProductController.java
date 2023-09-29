package com.nuwanasiri.ecommercespringbootmicroservices.controller;

import com.nuwanasiri.ecommercespringbootmicroservices.model.BaseProduct;
import com.nuwanasiri.ecommercespringbootmicroservices.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<BaseProduct> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public BaseProduct getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public BaseProduct createProduct(@RequestBody BaseProduct product) {
        return productService.createProduct(product);
    }

    @PutMapping("/products/{id}")
    public BaseProduct updateProduct(@PathVariable Long id, @RequestBody BaseProduct product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}

