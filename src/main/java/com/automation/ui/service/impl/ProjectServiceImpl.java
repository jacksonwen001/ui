package com.automation.ui.service.impl;

import com.automation.ui.dto.project.ProjectCreateRequest;
import com.automation.ui.dto.project.ProjectMigrateRequest;
import com.automation.ui.dto.project.ProjectResponse;
import com.automation.ui.dto.project.QueryProjectRequest;
import com.automation.ui.dto.project.QueryProjectsResponse;
import com.automation.ui.dto.project.ProjectUpdateRequest;
import com.automation.ui.models.Project;
import com.automation.ui.repository.ProjectRepository;
import com.automation.ui.service.ProjectService;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);
    @Autowired
    ProjectRepository repository;

    @Override
    public QueryProjectsResponse query(QueryProjectRequest request, Pageable pageable) {
        Specification<Project> specification = (root, query, criteriaBuilder) -> {
            Optional<String> name = Optional.ofNullable(request.getName());
            if (name.isPresent()) {
                return criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%" + name.get().toLowerCase() + "%");
            }
            return criteriaBuilder.conjunction();
        };

        Page<Project> projects = repository.findAllByCreatedAtDesc(specification, pageable);

        QueryProjectsResponse response = new QueryProjectsResponse();
        response.setTotal(projects.getTotalElements());
        response.setProjects(projects.stream().map(project -> {
            ProjectResponse projectResponse = new ProjectResponse();
            projectResponse.setId(project.getId());
            projectResponse.setName(project.getName());
            projectResponse.setDescription(project.getDescription());
            projectResponse.setCreatedAt(project.getCreatedAt());
            projectResponse.setUpdatedAt(project.getUpdatedAt());
            projectResponse.setCreatedBy(project.getCreatedBy());
            projectResponse.setUpdatedBy(project.getUpdatedBy());
            return projectResponse;
        }).toList());
        return response;
    }

    @Override
    public void create(ProjectCreateRequest request) {
        Project project = new Project();
        project.setName(request.getName());
        project.setDescription(request.getDescription());
        project.setCreatedAt(LocalDateTime.now());
        project.setCreatedBy("ADMIN");
        repository.save(project);
    }

    @Override
    public void delete(Long projectId) {
        repository.deleteById(projectId);
    }

    @Override
    public void update(Long projectId, ProjectUpdateRequest request) {
        Project project = repository.findById(projectId).orElseThrow();
        Optional.ofNullable(request.getName()).ifPresent(project::setName);
        Optional.ofNullable(request.getDescription()).ifPresent(project::setDescription);
        project.setUpdatedAt(LocalDateTime.now());
        project.setUpdatedBy("ADMIN");
        repository.save(project);
    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public void migrate(ProjectMigrateRequest request) {

    }

}
