package com.automation.ui.service;

import com.automation.ui.dto.suite.detail.CreateSuiteDetailRequest;
import com.automation.ui.dto.suite.detail.QuerySuiteDetailRequest;
import com.automation.ui.dto.suite.detail.QuerySuiteDetailResponse;
import com.automation.ui.dto.suite.detail.UpdateSuiteDetailRequest;

public interface SuiteDetailService {
    QuerySuiteDetailResponse query(QuerySuiteDetailRequest request);
    void create(CreateSuiteDetailRequest request);
    void update(String id, UpdateSuiteDetailRequest request);
    void remove(String id);
}
