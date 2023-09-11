package com.uptc.frw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
}
