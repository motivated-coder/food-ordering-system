package com.foodie.common.commondomain.valueobject;

import java.util.UUID;

public class CustomerId extends BaseId<UUID> {

    protected CustomerId(UUID uuid) {
        super(uuid);
    }
}
