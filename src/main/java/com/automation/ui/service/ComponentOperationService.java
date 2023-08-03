package com.automation.ui.service;

import com.automation.ui.dto.component.operation.CreateOperationRequest;
import com.automation.ui.dto.component.operation.QueryOperationRequest;
import com.automation.ui.dto.component.operation.QueryOperationResponse;
import com.automation.ui.dto.component.operation.UpdateOperationRequest;

public interface ComponentOperationService {
    QueryOperationResponse query(QueryOperationRequest request);
    void create(CreateOperationRequest request);
    void update(String id, UpdateOperationRequest request);
    void remove(String id);
}
