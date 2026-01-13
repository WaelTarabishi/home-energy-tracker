package com.leetjourney.alert_service.repository;

import com.leetjourney.alert_service.entity.AlertEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository  extends JpaRepository<AlertEntity, Long> {
}