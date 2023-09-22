package com.example.casoestudio.controller;

import com.example.casoestudio.entity.ModeloMy;
import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.repository.ModeloMyRepository;
import com.example.casoestudio.services.ModeloMyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/modelo")
public class ModeloMyController {

    @Autowired
    private ModeloMyServices modeloMyServices;

    //--------------------------------------------------------------------
    @GetMapping
    public List<ModeloMy> getModeloAll(){
        return modeloMyServices.getModeloMyAll();
    }
    //--------------------------------------------------------------------
    @GetMapping("/{ID}")
    public Optional<ModeloMy> getModeloById(@PathVariable("ID") Long ID){
        return modeloMyServices.getModeloMyById(ID);
    }
    //--------------------------------------------------------------------
    @PostMapping
    public void saveUpdate(@RequestBody ModeloMy modeloMy){
        modeloMyServices.saveOrUpdate(modeloMy);
    }
    //--------------------------------------------------------------------
    @DeleteMapping("/{ID}")
    public void deleteById(@PathVariable("ID") Long ID){
        modeloMyServices.deleteById(ID);
    }
}
