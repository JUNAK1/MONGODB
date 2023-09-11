package com.uptc.frw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MODELOS")

public class Modelo {
    @Id
    @Column(name = "ID_MODELO")
    private Long idModelos;
    @Column(name = "AÑOS")
    private Long año;
    @Column(name = "REFERENCIAS")
    private String referencia;
    @Column(name = "TIPO_VEHICULOS")
    private String tipoVehiculo;
}
