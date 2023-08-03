package com.automation.ui.service.impl;

import com.automation.ui.dto.component.element.CreateElementRequest;
import com.automation.ui.dto.component.element.QueryElementRequest;
import com.automation.ui.dto.component.element.QueryElementResponse;
import com.automation.ui.dto.component.element.UpdateElementRequest;
import com.automation.ui.service.ComponentElementService;
import org.springframework.stereotype.Service;

@Service
public class ComponentElementServiceImpl implements ComponentElementService {
    @Override
    public QueryElementResponse query(QueryElementRequest request) {
        return null;
    }

    @Override
    public void create(CreateElementRequest request) {

    }

    @Override
    public void update(String id, UpdateElementRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
