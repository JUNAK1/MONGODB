package com.example.casoestudio.services;

import com.example.casoestudio.entity.ModeloMy;
import com.example.casoestudio.repository.ModeloMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloMyServices {
    @Autowired
    ModeloMyRepository modeloMyRepository;

    public List<ModeloMy> getModeloMyAll(){
        return modeloMyRepository.findAll();
    }

    public Optional<ModeloMy> getModeloMyById(Long id){
        return modeloMyRepository.findById(id);
    }

    public void saveOrUpdate(ModeloMy modeloMy){
        modeloMyRepository.save(modeloMy);
    }

    public void deleteById(Long id){
        modeloMyRepository.deleteById(id);
    }

}
