package com.example.casoestudio.entity;

import javax.persistence.*;

@Entity
@Table(name = "ADICIONALES")
public class AdicionalesMy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAdicionales")
    private Long idAdicionales;
    @Column(name = "aireAcondicionado")
    private Boolean aireAcondicionado;
    @Column(name = "rinesLujo")
    private Boolean rinesLujo;
    @Column(name = "acientosCuero")
    private Boolean acientosCuero;
    @Column(name = "vidrioElectricos")
    private Boolean vidrioElectricos;
    @Column(name = "descripcion")
    private String descripcion;

    public AdicionalesMy() {
    }

    public AdicionalesMy(Long idAdicionales, Boolean aireAcondicionado,
                         Boolean rinesLujo, Boolean acientosCuero,
                         Boolean vidrioElectricos, String descripcion)
    {
        this.idAdicionales = idAdicionales;
        this.aireAcondicionado = aireAcondicionado;
        this.rinesLujo = rinesLujo;
        this.acientosCuero = acientosCuero;
        this.vidrioElectricos = vidrioElectricos;
        this.descripcion = descripcion;
    }

    public Long getIdAdicionales() {
        return idAdicionales;
    }

    public void setIdAdicionales(Long idAdicionales) {
        this.idAdicionales = idAdicionales;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public Boolean getRinesLujo() {
        return rinesLujo;
    }

    public void setRinesLujo(Boolean rinesLujo) {
        this.rinesLujo = rinesLujo;
    }

    public Boolean getAcientosCuero() {
        return acientosCuero;
    }

    public void setAcientosCuero(Boolean acientosCuero) {
        this.acientosCuero = acientosCuero;
    }

    public Boolean getVidrioElectricos() {
        return vidrioElectricos;
    }

    public void setVidrioElectricos(Boolean vidrioElectricos) {
        this.vidrioElectricos = vidrioElectricos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "AdicionalesMyServices{" +
                "idAdicionales=" + idAdicionales +
                ", aireAcondicionado=" + aireAcondicionado +
                ", rinesLujo=" + rinesLujo +
                ", acientosCuero=" + acientosCuero +
                ", vidrioElectricos=" + vidrioElectricos +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
