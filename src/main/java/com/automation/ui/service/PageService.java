package com.automation.ui.service;

import com.automation.ui.dto.page.CreatePageRequest;
import com.automation.ui.dto.page.QueryPageResponse;
import com.automation.ui.dto.page.QueryPageRequest;
import com.automation.ui.dto.page.UpdatePageRequest;

public interface PageService {
    QueryPageResponse query(QueryPageRequest request);
    void create(CreatePageRequest request);
    void update(Long id, UpdatePageRequest request);
    void remove(Long id);
}
