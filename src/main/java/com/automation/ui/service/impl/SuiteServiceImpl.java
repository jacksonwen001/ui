package com.automation.ui.service.impl;

import com.automation.ui.dto.suite.CreateSuiteRequest;
import com.automation.ui.dto.suite.QuerySuiteRequest;
import com.automation.ui.dto.suite.QuerySuiteResponse;
import com.automation.ui.dto.suite.UpdateSuiteRequest;
import com.automation.ui.service.SuiteService;
import org.springframework.stereotype.Service;

@Service
public class SuiteServiceImpl implements SuiteService {
    @Override
    public QuerySuiteResponse query(QuerySuiteRequest request) {
        return null;
    }

    @Override
    public void create(CreateSuiteRequest request) {

    }

    @Override
    public void update(String id, UpdateSuiteRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
