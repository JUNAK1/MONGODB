package com.uptc.frw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "PERSONAS")
public class Persona {
    @Id
    @Column(name = "ID_PERSONA")
    private Long id;

    @Column(name = "NOMBRES")
    private  String nombre;

    @Column(name = "APELLIDOS")
    private String apellido;
    @Column(name = "NACIMIENTOS")
    private Date fechaNacimiento;
    @Column(name = "TIPOSDOC")
    private  String tipoDocumento;
    @Column(name = "NDOCUMENTOS")
    private String numeroDocumento;
    @Column(name = "DIRECCIONES")
    private String direccion;
    @Column(name = "TELEFONOS")
    private String telefono;
}
