package com.automation.ui.service.impl;

import com.automation.ui.dto.component.operation.CreateOperationRequest;
import com.automation.ui.dto.component.operation.QueryOperationRequest;
import com.automation.ui.dto.component.operation.QueryOperationResponse;
import com.automation.ui.dto.component.operation.UpdateOperationRequest;
import com.automation.ui.service.ComponentOperationService;
import org.springframework.stereotype.Service;

@Service
public class ComponentOperationServiceImpl implements ComponentOperationService {
    @Override
    public QueryOperationResponse query(QueryOperationRequest request) {
        return null;
    }

    @Override
    public void create(CreateOperationRequest request) {

    }

    @Override
    public void update(String id, UpdateOperationRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
