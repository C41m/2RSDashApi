package com.dash.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "geempre", schema = "bethadba")
public class Customer {

    @Id
    @Column(name = "codi_emp")
    private Long idEmp;

    @Column(name = "nome_emp")
    private String razaoSocial;

    @Column(name = "cgce_emp")
    private String cnpjEmpresa;



    public String getCnpjEmpresa(){
        return cnpjEmpresa;
    }

    public Long getId(){
        return idEmp;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

}
