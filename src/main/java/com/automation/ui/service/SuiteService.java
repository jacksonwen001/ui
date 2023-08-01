package com.automation.ui.service;

import com.automation.ui.dto.suite.CreateSuiteRequest;
import com.automation.ui.dto.suite.QuerySuiteRequest;
import com.automation.ui.dto.suite.QuerySuiteResponse;
import com.automation.ui.dto.suite.UpdateSuiteRequest;

public interface SuiteService {
    QuerySuiteResponse query(QuerySuiteRequest request);
    void create(CreateSuiteRequest request);
    void update(String id, UpdateSuiteRequest request);
    void remove(String id);
}
