package com.automation.ui.models;


import com.automation.ui.enums.CommandType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "component_steps")
public class ComponentStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "project_id")
    public Long projectId;

    @NotNull
    @Column(name = "env_id")
    public Long envId;

    @NotNull
    @Column(name = "component_id")
    public Long componentId;

    @NotNull
    @Column(name = "component_operation_id")
    public Long componentOperationId;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @Column(name = "command")
    public CommandType command;

    @Column(name = "element_id")
    public Long elementId;

    @Column(name = "target_value")
    public String targetValue;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
