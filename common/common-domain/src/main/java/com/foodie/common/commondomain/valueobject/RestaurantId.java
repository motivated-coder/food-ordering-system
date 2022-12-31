package com.foodie.common.commondomain.valueobject;

import java.util.UUID;

public class RestaurantId extends BaseId<UUID>{
    protected RestaurantId(UUID uuid) {
        super(uuid);
    }
}
