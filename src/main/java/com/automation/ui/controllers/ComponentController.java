package com.automation.ui.controllers;

import com.automation.ui.dto.component.CreateComponentRequest;
import com.automation.ui.dto.component.QueryComponentResponse;
import com.automation.ui.dto.component.QueryComponentRequest;
import com.automation.ui.dto.component.UpdateComponentRequest;
import com.automation.ui.service.ComponentService;
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
@RequestMapping("/components")
public class ComponentController {
    @Autowired
    ComponentService service;

    @GetMapping("")
    public ResponseEntity<QueryComponentResponse> query(QueryComponentRequest request) {
        return new ResponseEntity<>(service.query(request), HttpStatus.OK);
    }

    @PutMapping("/{pageId}")
    public void update(@PathParam ("pageId") Long pageId, @RequestBody UpdateComponentRequest request) {
        service.update(pageId, request);
    }

    @DeleteMapping("/{pageId}")
    public void delete(@PathParam ("pageId") Long pageId) {
        service.remove(pageId);
    }

    @PostMapping("")
    public void create(@RequestBody CreateComponentRequest request) {
        service.create(request);
    }
}
