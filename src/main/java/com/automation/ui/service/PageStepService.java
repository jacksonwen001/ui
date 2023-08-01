package com.automation.ui.service;

import com.automation.ui.dto.page.step.CreatePageStepRequest;
import com.automation.ui.dto.page.step.QueryPageStepRequest;
import com.automation.ui.dto.page.step.QueryPageStepResponse;
import com.automation.ui.dto.page.step.UpdatePageStepRequest;

public interface PageStepService {
    QueryPageStepResponse query(QueryPageStepRequest request);
    void create(CreatePageStepRequest request);
    void update(String id, UpdatePageStepRequest request);
    void remove(String id);
}
