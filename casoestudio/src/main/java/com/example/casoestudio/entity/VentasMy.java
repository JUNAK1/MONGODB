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
    @Column(name = "idCliente", insertable = false, updatable = false)
    private Long idCliente;
    @Column(name = "idVendedor", insertable = false, updatable = false)
    private Long idVendedor;
    @Column(name ="idTipoPago",insertable = false, updatable = false)
    private Long idTipoPago;
    @Column(name = "idNuevo", insertable = false, updatable = false)
    private Long idNuevo;
//----------------------------------------------------------------------------

    @ManyToOne
    @JoinColumn(name = "idVendedor")
    private PersonasMy vendedorMy;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private PersonasMy clienteMy;

    @ManyToOne
    @JoinColumn(name = "idNuevo")
    private VehiculosMy vehiculoNuevo;

    @ManyToOne
    @JoinColumn(name = "idTipoPago")
    private VehiculosMy vehiculoPago;

//----------------------------------------------------------------------------------------------
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

    public PersonasMy getVendedorMy() {
        return vendedorMy;
    }

    public void setVendedorMy(PersonasMy vendedorMy) {
        this.vendedorMy = vendedorMy;
    }

    public PersonasMy getClienteMy() {
        return clienteMy;
    }

    public void setClienteMy(PersonasMy clienteMy) {
        this.clienteMy = clienteMy;
    }

    public VehiculosMy getVehiculoNuevo() {
        return vehiculoNuevo;
    }

    public void setVehiculoNuevo(VehiculosMy vehiculoNuevo) {
        this.vehiculoNuevo = vehiculoNuevo;
    }

    public VehiculosMy getVehiculoPago() {
        return vehiculoPago;
    }

    public void setVehiculoPago(VehiculosMy vehiculoPago) {
        this.vehiculoPago = vehiculoPago;
    }
}
