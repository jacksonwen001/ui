package com.automation.ui.service.impl;

import com.automation.ui.dto.suite.detail.CreateSuiteDetailRequest;
import com.automation.ui.dto.suite.detail.QuerySuiteDetailRequest;
import com.automation.ui.dto.suite.detail.QuerySuiteDetailResponse;
import com.automation.ui.dto.suite.detail.UpdateSuiteDetailRequest;
import com.automation.ui.service.SuiteDetailService;
import org.springframework.stereotype.Service;

@Service
public class SuiteDetailServiceImpl implements SuiteDetailService {
    @Override
    public QuerySuiteDetailResponse query(QuerySuiteDetailRequest request) {
        return null;
    }

    @Override
    public void create(CreateSuiteDetailRequest request) {

    }

    @Override
    public void update(String id, UpdateSuiteDetailRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
