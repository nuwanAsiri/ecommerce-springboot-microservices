package com.nuwanasiri.ecommercespringbootmicroservices.model;

import lombok.Data;

@Data
public class BaseProduct {
    private double unitPrice;
    private String name;
    private String description;
    private String imageURL;

    private int quantity;
}
