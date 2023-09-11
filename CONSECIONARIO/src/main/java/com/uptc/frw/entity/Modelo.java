package com.uptc.frw.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "MODELOS")

public class Modelo {
    @Id
    @Column(name = "ID_MODELO")
    private Long idModelo;
    @Column(name = "AÑOS")
    private Long año;
    @Column(name = "REFERENCIAS")
    private String referencia;
    @Column(name = "TIPO_VEHICULOS")
    private String tipoVehiculo;

    @OneToMany(mappedBy = "modelo")
    private List<Vehiculo>vehiculos;
    /**/

    public Modelo(){}

    public Modelo(Long idModelos, Long año, String referencia, String tipoVehiculo) {
        this.idModelo = idModelos;
        this.año = año;
        this.referencia = referencia;
        this.tipoVehiculo = tipoVehiculo;
    }

    public Long getIdModelos() {
        return idModelo;
    }

    public void setIdModelos(Long idModelos) {
        this.idModelo = idModelo;
    }

    public Long getAño() {
        return año;
    }

    public void setAño(Long año) {
        this.año = año;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "idModelos=" + idModelo +
                ", año=" + año +
                ", referencia='" + referencia + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }
}
