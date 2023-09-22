package com.example.casoestudio.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "VENTAS")
public class VentasMy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVentas")
    private Long idVentas;
    @Column(name = "fechaVenta")
    private Date fechaVenta;
    @Column(name = "tipoPago")
    private String tipoPago;
    @Column(name = "idCliente")
    private Long idCliente;
    @Column(name = "idVendedor")
    private Long idVendedor;
    @Column(name ="idTipoPago")
    private Long idTipoPago;
    @Column(name = "idNuevo")
    private Long idNuevo;


    public VentasMy() {
    }

    public VentasMy(Long idVentas, Date fechaVenta, String tipoPago) {
        this.idVentas = idVentas;
        this.fechaVenta = fechaVenta;
        this.tipoPago = tipoPago;
    }

    public Long getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(Long idVentas) {
        this.idVentas = idVentas;
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

    public Long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Long idVendedor) {
        this.idVendedor = idVendedor;
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
}
