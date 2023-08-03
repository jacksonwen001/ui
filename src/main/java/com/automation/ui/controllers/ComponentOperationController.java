package com.automation.ui.controllers;

import com.automation.ui.service.ComponentOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component/operations")
public class ComponentOperationController {
    @Autowired
    ComponentOperationService service;

}
