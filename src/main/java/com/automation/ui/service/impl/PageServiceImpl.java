package com.automation.ui.service.impl;

import com.automation.ui.dto.page.CreatePageRequest;
import com.automation.ui.dto.page.QueryPageResponse;
import com.automation.ui.dto.page.QueryPageRequest;
import com.automation.ui.dto.page.UpdatePageRequest;
import com.automation.ui.service.PageService;
import org.springframework.stereotype.Service;

@Service
public class PageServiceImpl implements PageService {
    @Override
    public QueryPageResponse query(QueryPageRequest request) {
        return null;
    }

    @Override
    public void create(CreatePageRequest request) {

    }

    @Override
    public void update(Long id, UpdatePageRequest request) {

    }

    @Override
    public void remove(Long id) {

    }

}
