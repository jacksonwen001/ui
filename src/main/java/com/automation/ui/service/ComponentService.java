package com.automation.ui.service;

import com.automation.ui.dto.component.CreateComponentRequest;
import com.automation.ui.dto.component.QueryComponentResponse;
import com.automation.ui.dto.component.QueryComponentRequest;
import com.automation.ui.dto.component.UpdateComponentRequest;

public interface ComponentService {
    QueryComponentResponse query(QueryComponentRequest request);
    void create(CreateComponentRequest request);
    void update(Long id, UpdateComponentRequest request);
    void remove(Long id);
}
