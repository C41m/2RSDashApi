package com.dash.api.repository;

import com.dash.api.model.SaleProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleProductRepository extends JpaRepository<SaleProduct, Long> {

    List<SaleProduct> findByIdIdEmpresa(Integer idEmpresa);

}
