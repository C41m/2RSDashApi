package com._rsapi.api.controller;

import com._rsapi.api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomersController {

    @Autowired
    private CustomerService service;

    @GetMapping("/")
    public Map<String, Object> getTopEfServico() {
        return service.getTopEfServico();
    }
}
