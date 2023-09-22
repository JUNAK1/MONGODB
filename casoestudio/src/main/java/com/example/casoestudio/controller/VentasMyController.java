package com.example.casoestudio.controller;

import com.example.casoestudio.entity.VehiculosMy;
import com.example.casoestudio.entity.VentasMy;
import com.example.casoestudio.services.VentasMyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/ventas")
public class VentasMyController {

    @Autowired
    private VentasMyServices ventasMyServices;

    //--------------------------------------------------------------------
    @GetMapping
    public List<VentasMy> getVentasAll(){
        return ventasMyServices.getVentasMyAll();
    }
    //--------------------------------------------------------------------
    @GetMapping("/{ID}")
    public Optional<VentasMy> getVentasById(@PathVariable("ID") Long ID){
        return ventasMyServices.getVentasMyById(ID);
    }
    //--------------------------------------------------------------------
    @PostMapping
    public void saveUpdate(@RequestBody VentasMy ventasMy){
        ventasMyServices.saveOrUpdate(ventasMy);
    }
    //--------------------------------------------------------------------
    @DeleteMapping("/{ID}")
    public void deleteById(@PathVariable("ID") Long ID){
        ventasMyServices.deleteById(ID);
    }

}
