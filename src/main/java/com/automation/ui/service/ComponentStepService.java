package com.automation.ui.service;

import com.automation.ui.dto.component.step.CreateStepRequest;
import com.automation.ui.dto.component.step.QueryStepRequest;
import com.automation.ui.dto.component.step.QueryPageStepResponse;
import com.automation.ui.dto.component.step.UpdateStepRequest;

public interface ComponentStepService {
    QueryPageStepResponse query(QueryStepRequest request);
    void create(CreateStepRequest request);
    void update(String id, UpdateStepRequest request);
    void remove(String id);
}
