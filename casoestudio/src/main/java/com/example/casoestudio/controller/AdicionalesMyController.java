package com.example.casoestudio.controller;

import com.example.casoestudio.entity.AdicionalesMy;
import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.services.AdicionalesMyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/adicionales")
public class AdicionalesMyController {

    @Autowired
    private AdicionalesMyServices adicionalesMyServices;

    //--------------------------------------------------------------------
    @GetMapping
    public List<AdicionalesMy> getAdicionalesAll(){
        return adicionalesMyServices.getAdicionalMyAll();
    }
    //--------------------------------------------------------------------
    @GetMapping("/{ID}")
    public Optional<AdicionalesMy> getPersonasById(@PathVariable("ID") Long ID){
        return adicionalesMyServices.getAdicionalMyById(ID);
    }
    //--------------------------------------------------------------------
    @PostMapping
    public void saveUpdate(@RequestBody AdicionalesMy adicionalesMy){
        adicionalesMyServices.saveOrUpdate(adicionalesMy);
    }
    //--------------------------------------------------------------------
    @DeleteMapping("/{ID}")
    public void deleteById(@PathVariable("ID") Long ID){
        adicionalesMyServices.deleteById(ID);
    }



}
