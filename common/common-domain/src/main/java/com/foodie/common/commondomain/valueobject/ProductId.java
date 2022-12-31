package com.foodie.common.commondomain.valueobject;

import java.util.UUID;

public class ProductId extends BaseId<UUID>{
    protected ProductId(UUID uuid) {
        super(uuid);
    }
}
