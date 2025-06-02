package com.dash.api.service;

import com.dash.api.model.SaleProduct;
import com.dash.api.model.SalesDTO;
import com.dash.api.repository.SaleProductRepository;
import com.dash.api.repository.SaleServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dash.api.model.SaleService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SaleServiceRepository saleServiceRepository;

    @Autowired
    private SaleProductRepository saleProductRepository;

    /// Services Section
    public List<SaleService> getAllSaleService() {
        return saleServiceRepository.findAll();
    }

    public List<SaleService> getSaleServiceByIdEmpresa(Integer idEmpresa) {
        return saleServiceRepository.findByIdIdEmpresa(idEmpresa);
    }

    /// Products Section
    public List<SaleProduct> getAllSaleProduct() {
        return saleProductRepository.findAll();
    }

    public List<SaleProduct> getSaleProductByIdEmpresa(Integer idEmpresa) {
        return saleProductRepository.findByIdIdEmpresa(idEmpresa);
    }

    ///  Total

    public List<SalesDTO> getAllSalesByIdEmpresa(Integer idEmpresa){
        List<SaleProduct> products = saleProductRepository.findByIdIdEmpresa(idEmpresa);
        List<SaleService> services = saleServiceRepository.findByIdIdEmpresa(idEmpresa);

        List<SalesDTO> sales = new ArrayList<>();

        products.forEach(p -> sales.add(
                new SalesDTO(
                        "Mercadoria",
                        p.getId().getIdEmpresa(),
                        p.getIdCliente(),
                        p.getId().getIdSaida(),
                        p.getNumSaida(),
                        p.getDataSaida(),
                        p.getValorSaida(),
                        p.getCancelada()
                )

        ));

        services.forEach(s -> sales.add(
                new SalesDTO(
                        "Serviço",
                        s.getId().getIdEmpresa(),
                        s.getIdCliente(),
                        s.getId().getIdServico(),
                        s.getNumServico(),
                        s.getDataServico(),
                        s.getValorServico(),
                        s.getCancelada()
                )
        ));

        return sales;
    }
}
