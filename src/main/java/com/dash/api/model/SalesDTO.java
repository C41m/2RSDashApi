package com.dash.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
public class SalesDTO {
    private String tipo;
    private Integer idEmpresa;
    private Integer idCliente;
    private Integer id;
    private Date data;
    private Double valor;
    private Integer numDocumento;
    private String cancelada;

    public SalesDTO(String tipo, Integer idEmpresa, Integer idCliente, Integer id, Integer numDocumento, Date data, Double valor, String cancelada) {
        this.tipo = tipo;
        this.idEmpresa = idEmpresa;
        this.idCliente = idCliente;
        this.id = id;
        this.numDocumento = numDocumento;
        this.data = data;
        this.valor = valor;
        this.cancelada = cancelada;
    }


}
