package com.foodie.orderdomain.core.entity;

import com.foodie.common.commondomain.entity.BaseEntity;
import com.foodie.common.commondomain.valueobject.Money;
import com.foodie.common.commondomain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }


}
