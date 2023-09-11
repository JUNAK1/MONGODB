package com.uptc.frw.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADICIONALES")
public class Adicional {
    @Id
    @Column(name = "ID_VEHICULO")
    private String idVehiculos;
    @Column(name = "MARCAS")
    private String marca;
    @Column(name = "MODELOS")
    private String modelo;
    @Column(name = "CILINDRADAS")
    private String cilindrada;
    @Column(name = "PRECIOS")
    private Long precio;
    @Column(name = "MATRICULAS")
    private Long matricula;
    @Column(name = "USADOS")
    private String usado;

}
