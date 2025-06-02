package com.dash.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SaleProductId implements Serializable {

    @Column(name = "codi_emp")
    private Integer idEmpresa;

    @Column(name = "codi_sai")
    private Integer idSaida;

    public SaleProductId() {}

    public SaleProductId(Integer idEmpresa, Integer idSaida) {
        this.idEmpresa = idEmpresa;
        this.idSaida = idSaida;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(Integer idSaida) {
        this.idSaida = idSaida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleProductId that)) return false;
        return Objects.equals(idEmpresa, that.idEmpresa) &&
                Objects.equals(idSaida, that.idSaida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpresa, idSaida);
    }
}
