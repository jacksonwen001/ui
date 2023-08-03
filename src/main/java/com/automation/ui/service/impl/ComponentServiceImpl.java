package com.automation.ui.service.impl;

import com.automation.ui.dto.component.CreateComponentRequest;
import com.automation.ui.dto.component.QueryComponentResponse;
import com.automation.ui.dto.component.QueryComponentRequest;
import com.automation.ui.dto.component.UpdateComponentRequest;
import com.automation.ui.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponentServiceImpl implements ComponentService {
    @Autowired

    @Override
    public QueryComponentResponse query(QueryComponentRequest request) {
        return null;
    }

    @Override
    public void create(CreateComponentRequest request) {

    }

    @Override
    public void update(Long id, UpdateComponentRequest request) {

    }

    @Override
    public void remove(Long id) {

    }

}
