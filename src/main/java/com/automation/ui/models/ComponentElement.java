package com.automation.ui.models;

import com.automation.ui.enums.SelectorType;
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
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Entity
@Table(name = "component_elements")
public class ComponentElement {
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

    @NotBlank
    @Length(max = 120)
    @Column(name = "element_name")
    public String elementName;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @Column(name = "element_selector")
    public SelectorType elementSelector;

    @NotBlank
    @Column(name = "element_path")
    public String elementPath;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
