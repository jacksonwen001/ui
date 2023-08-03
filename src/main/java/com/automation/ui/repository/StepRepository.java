package com.automation.ui.repository;

import com.automation.ui.models.ComponentStep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepRepository extends JpaRepository<ComponentStep, Long> {
}
