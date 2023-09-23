package com.example.casoestudio.services;

import com.example.casoestudio.entity.ModeloMy;
import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.entity.VehiculosMy;
import com.example.casoestudio.entity.VentasMy;
import com.example.casoestudio.model.AuditoriaVehiculoMo;
import com.example.casoestudio.repository.VehiculosMyRepository;
import com.example.casoestudio.repository.VentasMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentasMyServices {

    @Autowired
    private VentasMyRepository ventasMyRepository;
    @Autowired
    private VehiculoMyServices vehiculoMyServices;
    @Autowired
    private PersonasMyServices personasMyServices;



    public List<VentasMy> getVentasMyAll(){
        return ventasMyRepository.findAll();
    }

    public Optional<VentasMy> getVentasMyById(Long id){
        return ventasMyRepository.findById(id);
    }

    public void saveOrUpdate(VentasMy ventasMy ){
        if(ventasMy.getIdTipoPago() != null){
            Optional<VehiculosMy> vehiculosMy = vehiculoMyServices.getVehiculosMyById(ventasMy.getIdTipoPago());
            ventasMy.setVehiculoPago(vehiculosMy.orElse(null));
        }
        if (ventasMy.getIdNuevo() != null) {
            Optional<VehiculosMy> vehiculosMy = vehiculoMyServices.getVehiculosMyById(ventasMy.getIdNuevo());
            ventasMy.setVehiculoNuevo(vehiculosMy.orElse(null));
        }

        if(ventasMy.getIdVendedor() != null){
            Optional<PersonasMy> personasMy = personasMyServices.getPersonaMyById(ventasMy.getIdVendedor());
            ventasMy.setVendedorMy(personasMy.orElse(null));
        }
        if (ventasMy.getIdCliente() != null) {
            Optional<PersonasMy> personasMy = personasMyServices.getPersonaMyById(ventasMy.getIdCliente());
            ventasMy.setClienteMy(personasMy.orElse(null));
        }

        ventasMy = ventasMyRepository.save(ventasMy);
        ventasMyRepository.save(ventasMy);
    }

    public void deleteById(Long id){
        ventasMyRepository.deleteById(id);
    }

}
