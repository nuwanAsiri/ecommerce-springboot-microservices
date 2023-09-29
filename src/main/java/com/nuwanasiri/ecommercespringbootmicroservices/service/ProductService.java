package com.nuwanasiri.ecommercespringbootmicroservices.service;

import com.nuwanasiri.ecommercespringbootmicroservices.model.BaseProduct;

import java.util.List;

public interface ProductService {
    List<BaseProduct> getAllProducts();

    BaseProduct getProductById(Long id);

    BaseProduct createProduct(BaseProduct product);

    BaseProduct updateProduct(Long id, BaseProduct product);

    void deleteProduct(Long id);


}
