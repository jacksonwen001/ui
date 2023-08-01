package com.automation.ui.service.impl;

import com.automation.ui.dto.page.element.CreatePageElementRequest;
import com.automation.ui.dto.page.element.QueryPageElementRequest;
import com.automation.ui.dto.page.element.QueryPageElementResponse;
import com.automation.ui.dto.page.element.UpdatePageElementRequest;
import com.automation.ui.service.PageElementService;
import org.springframework.stereotype.Service;

@Service
public class PageElementServiceImpl implements PageElementService {
    @Override
    public QueryPageElementResponse query(QueryPageElementRequest request) {
        return null;
    }

    @Override
    public void create(CreatePageElementRequest request) {

    }

    @Override
    public void update(String id, UpdatePageElementRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
