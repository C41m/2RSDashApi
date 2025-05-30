package com._rsapi.api.service;

import com._rsapi.api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Map<String, Object> getTopEfServico() {
        return repository.getTopEfServico();
    }
}
