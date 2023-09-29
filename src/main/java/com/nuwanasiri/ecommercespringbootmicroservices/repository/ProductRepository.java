package com.nuwanasiri.ecommercespringbootmicroservices.repository;

import com.nuwanasiri.ecommercespringbootmicroservices.model.BaseProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<BaseProduct, Long> {
}
