package com.example.casoestudio.controller;

import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.entity.VehiculosMy;
import com.example.casoestudio.services.VehiculoMyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/vehiculos")
public class VehiculosMyController {

    @Autowired
    private VehiculoMyServices vehiculoMyServices;

    //--------------------------------------------------------------------
    @GetMapping
    public List<VehiculosMy> getVehiculosAll(){
        return vehiculoMyServices.getVehiculosMyAll();
    }
    //--------------------------------------------------------------------
    @GetMapping("/{ID}")
    public Optional<VehiculosMy> getVehiculosById(@PathVariable("ID") Long ID){
        return vehiculoMyServices.getVehiculosMyById(ID);
    }
    //--------------------------------------------------------------------
    @PostMapping
    public void saveUpdate(@RequestBody VehiculosMy vehiculosMy){
        vehiculoMyServices.saveOrUpdate(vehiculosMy);
    }
    //--------------------------------------------------------------------
    @DeleteMapping("/{ID}")
    public void deleteById(@PathVariable("ID") Long ID){
        vehiculoMyServices.deleteById(ID);
    }

}
