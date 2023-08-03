package com.automation.ui.repository;

import com.automation.ui.models.Scenario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScenarioRepository extends JpaRepository<Scenario, Long> {
    Page<Scenario> findAllByCreatedAtDesc(Specification<Scenario> specification, Pageable pageable);
}
