package com.wael.ingestion_service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import java.time.Instant;

/**
 * This is a DTO (Data Transfer Object) for energy usage data.
 * It is implemented as a **record**, which is a special kind of class in Java.
 * Records are **immutable** by default: once an object is created, its fields cannot be changed.
 */
@Builder // ✅ Lombok annotation
// Adds a **builder pattern** for creating instances of this record fluently
// Example usage:
// EnergyUsageDto dto = EnergyUsageDto.builder()
//      .deviceId(1L)
//      .energyConsumed(10.5)
//      .timestamp(Instant.now())
//      .build();
// Note: Builder only helps to create objects, but does **not make it mutable**.
public record EnergyUsageDto (
        Long deviceId,
        double energyConsumed,
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        Instant timestamp
) {
    // ✅ Because this is a record:
    // - All fields are **final** → immutable
    // - Getters are automatically created with the **same name as fields**:
    //      dto.deviceId(), dto.energyConsumed(), dto.timestamp()
    // - equals(), hashCode(), and toString() are auto-generated
    // - You cannot add setters → dto.deviceId = 2L; ❌ ERROR
    //
    // ✅ Jackson @JsonFormat:
    // - Ensures that the Instant timestamp is serialized/deserialized as a string
    //   instead of default numeric timestamp
}