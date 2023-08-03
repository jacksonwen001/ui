package com.automation.ui.service;

import com.automation.ui.dto.component.element.CreateElementRequest;
import com.automation.ui.dto.component.element.QueryElementResponse;
import com.automation.ui.dto.component.element.QueryElementRequest;
import com.automation.ui.dto.component.element.UpdateElementRequest;

public interface ComponentElementService {
    QueryElementResponse query(QueryElementRequest request);
    void create(CreateElementRequest request);
    void update(String id, UpdateElementRequest request);
    void remove(String id);

}
