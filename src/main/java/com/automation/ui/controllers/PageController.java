package com.automation.ui.controllers;

import com.automation.ui.dto.page.CreatePageRequest;
import com.automation.ui.dto.page.QueryPageResponse;
import com.automation.ui.dto.page.QueryPageRequest;
import com.automation.ui.dto.page.UpdatePageRequest;
import com.automation.ui.service.PageService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pages")
public class PageController {
    @Autowired
    PageService service;

    @GetMapping("")
    public ResponseEntity<QueryPageResponse> query(QueryPageRequest request) {
        return new ResponseEntity<>(service.query(request), HttpStatus.OK);
    }

    @PutMapping("/{pageId}")
    public void update(@PathParam ("pageId") Long pageId, @RequestBody UpdatePageRequest request) {
        service.update(pageId, request);
    }

    @DeleteMapping("/{pageId}")
    public void delete(@PathParam ("pageId") Long pageId) {
        service.remove(pageId);
    }

    @PostMapping("")
    public void create(@RequestBody CreatePageRequest request) {
        service.create(request);
    }


}
