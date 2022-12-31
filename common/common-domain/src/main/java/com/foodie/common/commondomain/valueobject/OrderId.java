package com.foodie.common.commondomain.valueobject;

import java.util.UUID;

public class OrderId extends BaseId<UUID>{
    protected OrderId(UUID uuid) {
        super(uuid);
    }
}
