package com.example.casoestudio.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "VEHICULOS")
public class VehiculosMy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVehiculos", insertable = false, updatable = false)
    private Long idVehiculos;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "cilindrada")
    private String cilindrada;
    @Column(name = "precio")
    private Long precio;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "usado")
    private Boolean usado;
    @Column(name = "idModelo", insertable = false, updatable = false)
    private Long idModelo;


    //-----RELACIONES ENTRE TABLAS----------------------------------------------------------

    @ManyToMany(mappedBy = "vehiculosToMany")
    private List<AdicionalesMy> adicional;

    @ManyToOne
    @JoinColumn(name = "idModelo")
    private ModeloMy modeloMy;

    @OneToMany(mappedBy = "vehiculoNuevo")
    private List<VentasMy> ventasNuevo;

    @OneToMany(mappedBy = "vehiculoPago")
    private List<VentasMy> ventasPago;

    //--------------------------------------------------------------------------------------

    public VehiculosMy() {
    }

    public VehiculosMy(Long idVehiculos, String marca,
                       String modelo, String cilindrada,
                       Long precio, String matricula,
                       Boolean usado)
    {
        this.idVehiculos = idVehiculos;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
        this.matricula = matricula;
        this.usado = usado;
    }

    public Long getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(Long idVehiculos) {
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

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Boolean getUsado() {
        return usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    public Long getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Long idModelo) {
        this.idModelo = idModelo;
    }

    public List<AdicionalesMy> getAdicional() {
        return adicional;
    }

    public void setAdicional(List<AdicionalesMy> adicional) {
        this.adicional = adicional;
    }

    public ModeloMy getModeloMy() {
        return modeloMy;
    }

    public void setModeloMy(ModeloMy modeloMy) {
        this.modeloMy = modeloMy;
    }

    public List<VentasMy> getVentasNuevo() {
        return ventasNuevo;
    }

    public void setVentasNuevo(List<VentasMy> ventasNuevo) {
        this.ventasNuevo = ventasNuevo;
    }

    public List<VentasMy> getVentasPago() {
        return ventasPago;
    }

    public void setVentasPago(List<VentasMy> ventasPago) {
        this.ventasPago = ventasPago;
    }
}
