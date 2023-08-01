package com.automation.ui.service;

import com.automation.ui.dto.page.operation.CreatePageOperationRequest;
import com.automation.ui.dto.page.operation.QueryPageOperationRequest;
import com.automation.ui.dto.page.operation.QueryPageOperationResponse;
import com.automation.ui.dto.page.operation.UpdatePageOperationRequest;

public interface PageOperationService {
    QueryPageOperationResponse query(QueryPageOperationRequest request);
    void create(CreatePageOperationRequest request);
    void update(String id, UpdatePageOperationRequest request);
    void remove(String id);
}
