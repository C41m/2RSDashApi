package com.dash.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SaleServiceId implements Serializable {

    @Column(name = "codi_emp")
    private Integer idEmpresa;

    @Column(name = "codi_ser")
    private Integer idServico;

    public SaleServiceId() {}

    public SaleServiceId(Integer idEmpresa, Integer idServico) {
        this.idEmpresa = idEmpresa;
        this.idServico = idServico;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdServico() {
        return idServico;
    }

    public void setIdServico(Integer idServico) {
        this.idServico = idServico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleServiceId that)) return false;
        return Objects.equals(idEmpresa, that.idEmpresa) &&
                Objects.equals(idServico, that.idServico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpresa, idServico);
    }
}
