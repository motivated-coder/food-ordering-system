package com.foodie.orderdomain.core.valueobject;

import com.foodie.common.commondomain.valueobject.BaseId;

import java.util.UUID;

public class OrderItemId extends BaseId<Long> {
    protected OrderItemId(Long id) {
        super(id);
    }
}
