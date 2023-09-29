package com.nuwanasiri.ecommercespringbootmicroservices.service;

import com.nuwanasiri.ecommercespringbootmicroservices.model.BaseProduct;
import com.nuwanasiri.ecommercespringbootmicroservices.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<BaseProduct> getAllProducts() {
        return productRepository.findAll();
    }

    public BaseProduct getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public BaseProduct createProduct(BaseProduct product) {
        return productRepository.save(product);
    }

    public BaseProduct updateProduct(Long id, BaseProduct product) {
        BaseProduct existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setUnitPrice(product.getUnitPrice());
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setImageURL(product.getImageURL());
            existingProduct.setQuantity(product.getQuantity());
            return productRepository.save(existingProduct);
        } else {
            return null;
        }
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
