package com.uptc.frw.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADICIONALES")
public class Adicional {
    @Id
    @Column(name = "ID_ADICIONAL")
    private Long idAdicionales;

    @Column(name = "AIRE_ACONDICIONADO")
    private Boolean aireAcondicionado;
    @Column(name = "REINES")
    private Boolean rinesLujo;
    @Column(name = "CUEROS")
    private Boolean acientosCuero;
    @Column(name = "VIDRIOS")
    private Boolean vidrioElectricos;
    @Column(name = "DESCRIPCIONES")
    private String descripcion;

    /**/
    public  Adicional(){}

    public Adicional(Long idAdicionales, Boolean aireAcondicionado, Boolean rinesLujo, Boolean acientosCuero, Boolean vidrioElectricos, String descripcion) {
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
        return "Adicional{" +
                "idAdicionales=" + idAdicionales +
                ", aireAcondicionado=" + aireAcondicionado +
                ", rinesLujo=" + rinesLujo +
                ", acientosCuero=" + acientosCuero +
                ", vidrioElectricos=" + vidrioElectricos +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
