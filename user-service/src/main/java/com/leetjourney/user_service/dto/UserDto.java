package com.leetjourney.user_service.dto;

import lombok.Builder;
import lombok.Data;

/**
 * This is a DTO (Data Transfer Object) class for User.
 * DTOs are used to carry data between layers of your application (e.g., controller → service → repository).
 */
//@Data   // ✅ Lombok annotation
// Automatically generates:
// 1. Getters for all fields (e.g., getId(), getName())
// 2. Setters for all fields (e.g., setId(), setName()) → this makes the class **mutable**
// 3. equals() and hashCode() methods based on field values
// 4. toString() method for easy printing
//@Builder // ✅ Lombok annotation
// Adds a **builder pattern** for creating objects fluently
// Example usage:
// UserDto user = UserDto.builder()
//      .id("123")
//      .name("Wael")
//      .email("wael@example.com")
//      .build();
// Note: builder does **not make fields immutable** by itself; setters are still available
@Data
@Builder
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String address;
    private boolean alerting;
    private double energyAlertingThreshold;
}
