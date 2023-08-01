package com.automation.ui.service.impl;

import com.automation.ui.dto.page.operation.CreatePageOperationRequest;
import com.automation.ui.dto.page.operation.QueryPageOperationRequest;
import com.automation.ui.dto.page.operation.QueryPageOperationResponse;
import com.automation.ui.dto.page.operation.UpdatePageOperationRequest;
import com.automation.ui.service.PageOperationService;
import org.springframework.stereotype.Service;

@Service
public class PageOperationServiceImpl implements PageOperationService {
    @Override
    public QueryPageOperationResponse query(QueryPageOperationRequest request) {
        return null;
    }

    @Override
    public void create(CreatePageOperationRequest request) {

    }

    @Override
    public void update(String id, UpdatePageOperationRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
