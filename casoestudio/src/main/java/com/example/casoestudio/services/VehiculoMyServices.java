package com.example.casoestudio.services;

import com.example.casoestudio.entity.ModeloMy;
import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.entity.VehiculosMy;
import com.example.casoestudio.model.AuditoriaVehiculoMo;
import com.example.casoestudio.repository.AuditoriaVehiculoMoRepository;
import com.example.casoestudio.repository.AuditoriasPersonasMoRepository;
import com.example.casoestudio.repository.VehiculosMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculoMyServices {

    @Autowired
    private VehiculosMyRepository vehiculosMyRepository;
    @Autowired
    private ModeloMyServices modeloMyServices;
    @Autowired
    private AuditoriaVehiculoMoRepository auditoriaVehiculoMoRepository;


    public List<VehiculosMy> getVehiculosMyAll(){
        return vehiculosMyRepository.findAll();
    }

    public Optional<VehiculosMy> getVehiculosMyById(Long id){
        return vehiculosMyRepository.findById(id);
    }

    public void saveOrUpdate(VehiculosMy vehiculosMy){
        if(vehiculosMy.getIdModelo() != null){
            Optional<ModeloMy> modeloMy = modeloMyServices.getModeloMyById(vehiculosMy.getIdModelo());
            vehiculosMy.setModeloMy(modeloMy.orElse(null));
        }
        vehiculosMy = vehiculosMyRepository.save(vehiculosMy) ;

        AuditoriaVehiculoMo audiVehic = new AuditoriaVehiculoMo();
        audiVehic.setId(vehiculosMy.getIdVehiculos().toString());
        audiVehic.setMatricula(vehiculosMy.getMatricula().toString());
        audiVehic.setModelo(vehiculosMy.getModelo().toString());
        audiVehic.setPrecio(vehiculosMy.getPrecio().toString());
        audiVehic.setMarca(vehiculosMy.getMarca().toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaActual = sdf.format(new Date());
        audiVehic.setFecha(fechaActual);
        auditoriaVehiculoMoRepository.save(audiVehic);
    }

    public void deleteById(Long id){
        vehiculosMyRepository.deleteById(id);
    }


}
