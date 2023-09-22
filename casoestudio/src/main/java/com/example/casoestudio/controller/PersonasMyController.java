package com.example.casoestudio.controller;

import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.services.PersonasMyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personas")
public class PersonasMyController {
    @Autowired
    private PersonasMyServices personasMyServices;


    //--------------------------------------------------------------------
    @GetMapping
    public List<PersonasMy> getPersonasAll(){
        return personasMyServices.getPersonaMyAll();
    }
    //--------------------------------------------------------------------
    @GetMapping("/{ID}")
    public Optional<PersonasMy> getPersonasById(@PathVariable("ID") Long ID){
        return personasMyServices.getPersonaMyById(ID);
    }
    //--------------------------------------------------------------------
    @PostMapping
    public void saveUpdate(@RequestBody PersonasMy personasMy){
        personasMyServices.saveOrUpdate(personasMy);
    }
    //--------------------------------------------------------------------
    @DeleteMapping("/{ID}")
    public void deleteById(@PathVariable("ID") Long ID){
        personasMyServices.deleteById(ID);
    }

}
