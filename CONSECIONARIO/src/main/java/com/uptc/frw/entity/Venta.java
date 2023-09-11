package com.uptc.frw.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "VENTAS")
public class Venta {
    @Id
    @Column(name = "ID_VENTA")
    private Long id;
    @Column(name = "FECHA_VENTAS")
    private Date fechaVenta;
    @Column(name = "TIPO_PAGOS")
    private String tipoPago;

    @Column(name = "ID_PERSONA", insertable = false, updatable = false)
    private Long idCliente;
    @Column(name = "ID_PERSONA", insertable = false, updatable = false)
    private Long idvendedor;

    @Column(name = "ID_VEHICULO", insertable = false, updatable = false)
    private Long idTipoPago;
    @Column(name = "ID_VEHICULO", insertable = false, updatable = false)
    private Long idNuevo;
//Relacion VEHICULOS
    @ManyToOne
    @JoinColumn(name="idTipoPago", nullable = false)
    private Vehiculo tipodepago;
    @ManyToOne
    @JoinColumn(name="idNuevo", nullable = false)
    private Vehiculo nuevo;
//RELACION PERSONAS
    @ManyToOne
    @JoinColumn(name="idCliente", nullable=false)
    private Persona cliente;
    @ManyToOne
    @JoinColumn(name="idVendedor", nullable=false)
    private Persona vendedor;

    public Venta(){}

    public Venta(Long id, Date fechaVenta, String tipoPago, Long idCliente, Long idvendedor, Long idTipoPago, Long idNuevo) {
        this.id = id;
        this.fechaVenta = fechaVenta;
        this.tipoPago = tipoPago;
        this.idCliente = idCliente;
        this.idvendedor = idvendedor;
        this.idTipoPago = idTipoPago;
        this.idNuevo = idNuevo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(Long idvendedor) {
        this.idvendedor = idvendedor;
    }

    public Long getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(Long idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public Long getIdNuevo() {
        return idNuevo;
    }

    public void setIdNuevo(Long idNuevo) {
        this.idNuevo = idNuevo;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", fechaVenta=" + fechaVenta +
                ", tipoPago='" + tipoPago + '\'' +
                ", idCliente=" + idCliente +
                ", idvendedor=" + idvendedor +
                ", idTipoPago=" + idTipoPago +
                ", idNuevo=" + idNuevo +
                '}';
    }
}
