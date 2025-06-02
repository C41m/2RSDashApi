package com.dash.api.repository;

import com.dash.api.model.SaleService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleServiceRepository extends JpaRepository<SaleService, Long> {

    List<SaleService> findByIdIdEmpresa(Integer idEmpresa);

}
