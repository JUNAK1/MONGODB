package com.uptc.frw.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "VEHICULOS")
public class Vehiculo {
    @Id
    @Column(name = "ID_VEHICULO")
    private Long idVehiculo;
    @Column(name = "MARCAS")
    private String marca;
    @Column(name = "MODELOS")
    private String modelo;
    @Column(name = "CILINDRADOS")
    private String cilindrada;
    @Column(name = "PRECIOS")
    private Long precio;
    @Column(name = "MATRICULAS")
    private Long matricula;
    @Column(name = "USADOS")
    private Boolean usado;

    @Column(name = "ID_MODELO", insertable = false, updatable = false)
    private Long idModelo;

    @ManyToOne
    @JoinColumn(name = "ID_MODELO", nullable = false)
    private Modelo modele;

    @ManyToMany(mappedBy="adicionales")
    private List<Adicional>adicionals;

    @OneToMany(mappedBy="tipoPago")
    private List<Venta> ventasComoTipoPago;
    @OneToMany(mappedBy="nuevo")
    private List<Venta> ventasComoNuevo;

    /*
    @OneToMany(mappedBy = "vehiculo")
    private List<Venta>ventas;
    @OneToMany(mappedBy = "vehiculo")
    private List<Venta>ventas;*/

    /**/
    public Vehiculo(){}

    public Vehiculo(Long idVehiculo, String marca, String modelo, String cilindrada, Long precio, Long matricula, Boolean usado, Long idModelo) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
        this.matricula = matricula;
        this.usado = usado;
        this.idModelo = idModelo;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Boolean getUsado() {
        return usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    public Long getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Long idModelo) {
        this.idModelo = idModelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "idVehiculo=" + idVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", precio=" + precio +
                ", matricula=" + matricula +
                ", usado=" + usado +
                ", idModelo=" + idModelo +
                '}';
    }
}
