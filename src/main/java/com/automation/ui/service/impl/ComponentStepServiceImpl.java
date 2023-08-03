package com.automation.ui.service.impl;

import com.automation.ui.dto.component.step.CreateStepRequest;
import com.automation.ui.dto.component.step.QueryStepRequest;
import com.automation.ui.dto.component.step.QueryPageStepResponse;
import com.automation.ui.dto.component.step.UpdateStepRequest;
import com.automation.ui.service.ComponentStepService;
import org.springframework.stereotype.Service;

@Service
public class ComponentStepServiceImpl implements ComponentStepService {
    @Override
    public QueryPageStepResponse query(QueryStepRequest request) {
        return null;
    }

    @Override
    public void create(CreateStepRequest request) {

    }

    @Override
    public void update(String id, UpdateStepRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
