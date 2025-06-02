package com.dash.api.controller;

import com.dash.api.model.Customer;
import com.dash.api.model.SaleProduct;
import com.dash.api.model.SaleService;
import com.dash.api.model.SalesDTO;
import com.dash.api.service.CustomerService;
import com.dash.api.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService service;



    ///  Services Section
    @GetMapping("/services")
    public List<SaleService> getAllSaleService() {
        return service.getAllSaleService();
    }

    @GetMapping("/services/{idEmpresa}")
    public List<SaleService> getSaleServiceByIdEmpresa(@PathVariable Integer idEmpresa) {
        return service.getSaleServiceByIdEmpresa(idEmpresa);
    }

    ///  Products Section
    @GetMapping("/products")
    public List<SaleProduct> getAllSaleProduct() {
        return service.getAllSaleProduct();
    }

    @GetMapping("/products/{idEmpresa}")
    public List<SaleProduct> getSaleProductByIdEmpresa(@PathVariable Integer idEmpresa) {
        return service.getSaleProductByIdEmpresa(idEmpresa);
    }

    /// Total
    @GetMapping("total/{idEmpresa}")
    public List<SalesDTO> getAllSalesByIdEmpresa(@PathVariable Integer idEmpresa) {
        return service.getAllSalesByIdEmpresa(idEmpresa);
    }
}
