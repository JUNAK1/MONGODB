package com.example.casoestudio.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="PERSONAS")
public class PersonasMy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Long idPersona;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Column(name = "numeroDocumento")
    private String numeroDocumento;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fechaPersona")
    private Date fechaPersona;
    //---------------------------------------------------------------------------------

    @OneToMany(mappedBy = "vendedorMy")
    private List<VentasMy> ventasVendedor;

    @OneToMany(mappedBy = "clienteMy")
    private List<VentasMy> ventasCliente;

    //---------------------------------------------------------------------------------

    public PersonasMy() {
    }

    public PersonasMy(Long idPersona, String nombre, String apellido,
                      Date fechaNacimiento, String tipoDocumento,
                      String numeroDocumento, String direccion,
                      String telefono, Date fechaPersona)
    {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaPersona = fechaPersona;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaPersona() {
        return fechaPersona;
    }

    public void setFechaPersona(Date fechaPersona) {
        this.fechaPersona = fechaPersona;
    }

    public List<VentasMy> getVentasVendedor() {
        return ventasVendedor;
    }

    public void setVentasVendedor(List<VentasMy> ventasVendedor) {
        this.ventasVendedor = ventasVendedor;
    }

    public List<VentasMy> getVentasCliente() {
        return ventasCliente;
    }

    public void setVentasCliente(List<VentasMy> ventasCliente) {
        this.ventasCliente = ventasCliente;
    }
}
