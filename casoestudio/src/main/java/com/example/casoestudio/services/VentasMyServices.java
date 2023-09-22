package com.example.casoestudio.services;

import com.example.casoestudio.entity.VehiculosMy;
import com.example.casoestudio.entity.VentasMy;
import com.example.casoestudio.repository.VehiculosMyRepository;
import com.example.casoestudio.repository.VentasMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentasMyServices {

    @Autowired
    VentasMyRepository ventasMyRepository;

    public List<VentasMy> getVentasMyAll(){
        return ventasMyRepository.findAll();
    }

    public Optional<VentasMy> getVentasMyById(Long id){
        return ventasMyRepository.findById(id);
    }

    public void saveOrUpdate(VentasMy ventasMy){
        ventasMyRepository.save(ventasMy);
    }

    public void deleteById(Long id){
        ventasMyRepository.deleteById(id);
    }

}
