package com.example.casoestudio.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("AUDITORIA_VEHICULOS")
public class AuditoriaVehiculoMo {
    @Id
    private String id;
    private String operacion;
    private String fecha;
    private String idVehiculos;
    private String marca;
    private String modelo;
    private String cilindrada;
    private String precio;
    private String matricula;
    private String usado;
    private String idModelo;

    public AuditoriaVehiculoMo() {
    }

    public AuditoriaVehiculoMo(String id, String operacion,
                               String fecha, String idVehiculos,
                               String marca, String modelo,
                               String cilindrada, String precio,
                               String matricula, String usado,
                               String idModelo)
    {
        this.id = id;
        this.operacion = operacion;
        this.fecha = fecha;
        this.idVehiculos = idVehiculos;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
        this.matricula = matricula;
        this.usado = usado;
        this.idModelo = idModelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(String idVehiculos) {
        this.idVehiculos = idVehiculos;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUsado() {
        return usado;
    }

    public void setUsado(String usado) {
        this.usado = usado;
    }

    public String getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(String idModelo) {
        this.idModelo = idModelo;
    }
}
