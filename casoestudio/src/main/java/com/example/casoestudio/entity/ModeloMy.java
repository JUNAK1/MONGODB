package com.example.casoestudio.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MODELO")
public class ModeloMy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModelo")
    private Long idModelo;
    @Column(name = "fechaAno")
    private Date fechaAno;
    @Column(name = "referencia")
    private String referencia;
    @Column(name = "tipoVehiculo")
    private String tipoVehiculo;

    //-----RELACIONES ENTRE TABLAS----------------------------------------------------------

    @OneToMany(mappedBy = "modeloMy")
    private List<VehiculosMy> vehiculosMyList;

//-------------------------------------------------------------------------------------------

    public ModeloMy() {
    }

    public ModeloMy(Long idModelo, Date fechaAno, String referencia, String tipoVehiculo) {
        this.idModelo = idModelo;
        this.fechaAno = fechaAno;
        this.referencia = referencia;
        this.tipoVehiculo = tipoVehiculo;
    }

    public Long getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Long idModelo) {
        this.idModelo = idModelo;
    }

    public Date getFechaAno() {
        return fechaAno;
    }

    public void setFechaAno(Date fechaAno) {
        this.fechaAno = fechaAno;
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

    public List<VehiculosMy> getVehiculosMyList() {
        return vehiculosMyList;
    }

    public void setVehiculosMyList(List<VehiculosMy> vehiculosMyList) {
        this.vehiculosMyList = vehiculosMyList;
    }
}
