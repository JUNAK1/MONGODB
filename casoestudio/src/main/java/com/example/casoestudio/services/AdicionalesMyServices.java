package com.example.casoestudio.services;

import com.example.casoestudio.entity.AdicionalesMy;
import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.repository.AdicionalesMyRepository;
import com.example.casoestudio.repository.PersonasMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdicionalesMyServices {
    @Autowired
    AdicionalesMyRepository adicionalesMyRepository;

    public List<AdicionalesMy> getAdicionalMyAll(){
        return adicionalesMyRepository.findAll();
    }

    public Optional<AdicionalesMy> getAdicionalMyById(Long id){
        return adicionalesMyRepository.findById(id);
    }

    public void saveOrUpdate(AdicionalesMy adicionalesMy){
        adicionalesMyRepository.save(adicionalesMy);
    }

    public void deleteById(Long id){
        adicionalesMyRepository.deleteById(id);
    }

}
