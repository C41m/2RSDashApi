package com.dash.api.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@Immutable
@Table(name = "efsaidas", schema = "bethadba")
public class SaleProduct {

    @EmbeddedId
    private SaleProductId id;

    @Column(name = "codi_cli")
    private Integer idCliente;

    @Column(name = "nume_sai")
    private Integer numSaida;

    @Column(name = "dsai_sai")
    private Date dataSaida;

    @Column(name = "vcon_sai")
    private Double valorSaida;

    @Column(name = "cancelada_sai")
    private String cancelada;

    public Integer getIdCliente() {
        return idCliente;
    }

    public String getCancelada() {
        return cancelada;
    }

    public SaleProductId getId() {
        return id;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public Integer getNumSaida() {
        return numSaida;
    }

    public Double getValorSaida() {
        return valorSaida;
    }

}
