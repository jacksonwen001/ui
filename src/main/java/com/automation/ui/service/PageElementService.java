package com.automation.ui.service;

import com.automation.ui.dto.page.element.CreatePageElementRequest;
import com.automation.ui.dto.page.element.QueryPageElementResponse;
import com.automation.ui.dto.page.element.QueryPageElementRequest;
import com.automation.ui.dto.page.element.UpdatePageElementRequest;

public interface PageElementService {
    QueryPageElementResponse query(QueryPageElementRequest request);
    void create(CreatePageElementRequest request);
    void update(String id, UpdatePageElementRequest request);
    void remove(String id);

}
