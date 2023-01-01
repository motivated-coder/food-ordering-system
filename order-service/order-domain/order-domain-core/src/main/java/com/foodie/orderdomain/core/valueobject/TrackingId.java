package com.foodie.orderdomain.core.valueobject;

import com.foodie.common.commondomain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    protected TrackingId(UUID uuid) {
        super(uuid);
    }
}
