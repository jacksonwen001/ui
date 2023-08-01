package com.automation.ui.service.impl;

import com.automation.ui.dto.page.step.CreatePageStepRequest;
import com.automation.ui.dto.page.step.QueryPageStepRequest;
import com.automation.ui.dto.page.step.QueryPageStepResponse;
import com.automation.ui.dto.page.step.UpdatePageStepRequest;
import com.automation.ui.service.PageStepService;
import org.springframework.stereotype.Service;

@Service
public class PageStepServiceImpl implements PageStepService {
    @Override
    public QueryPageStepResponse query(QueryPageStepRequest request) {
        return null;
    }

    @Override
    public void create(CreatePageStepRequest request) {

    }

    @Override
    public void update(String id, UpdatePageStepRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
