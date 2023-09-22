package com.example.casoestudio.services;

import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.repository.PersonasMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonasMyServices {

    @Autowired
    PersonasMyRepository personasMyRepository;

    public List<PersonasMy> getPersonaMyAll(){
        return personasMyRepository.findAll();
    }

    public Optional<PersonasMy> getPersonaMyById(Long id){
        return personasMyRepository.findById(id);
    }

    public void saveOrUpdate(PersonasMy personasMy){
        personasMyRepository.save(personasMy);
    }

    public void deleteById(Long id){
        personasMyRepository.deleteById(id);
    }

}
