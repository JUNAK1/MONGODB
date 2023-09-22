package com.example.casoestudio.services;

import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.entity.VehiculosMy;
import com.example.casoestudio.repository.VehiculosMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoMyServices {

    @Autowired
    VehiculosMyRepository vehiculosMyRepository;

    public List<VehiculosMy> getVehiculosMyAll(){
        return vehiculosMyRepository.findAll();
    }

    public Optional<VehiculosMy> getVehiculosMyById(Long id){
        return vehiculosMyRepository.findById(id);
    }

    public void saveOrUpdate(VehiculosMy vehiculosMy){
        vehiculosMyRepository.save(vehiculosMy);
    }

    public void deleteById(Long id){
        vehiculosMyRepository.deleteById(id);
    }


}
