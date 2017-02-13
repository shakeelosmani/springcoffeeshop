package com.shakeel.model;

import javax.persistence.*;

/**
 * Created by shakeelosmani on 24/12/16.
 */

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long productId;

    private String productName;

    private Double productPrice;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }


}

