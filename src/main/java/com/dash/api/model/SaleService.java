package com.dash.api.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@Immutable
@Table(name = "efservicos", schema = "bethadba")
public class SaleService {

    @EmbeddedId
    private SaleServiceId id;

    @Column(name = "codi_cli")
    private Integer idCliente;

    @Column(name = "nume_ser")
    private Integer numServico;

    @Column(name = "dser_ser")
    private Date dataServico;

    @Column(name = "vcon_ser")
    private Double valorServico;

    @Column(name = "cancelada_ser")
    private String cancelada;

    public SaleServiceId getId() {
        return id;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public Date getDataServico() {
        return dataServico;
    }

    public Integer getNumServico() {
        return numServico;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public String getCancelada() {
        return cancelada;
    }
}
