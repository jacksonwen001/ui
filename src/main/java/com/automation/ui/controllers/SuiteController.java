package com.automation.ui.controllers;

import com.automation.ui.service.SuiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suites")
public class SuiteController {
    @Autowired
    SuiteService service;
}
