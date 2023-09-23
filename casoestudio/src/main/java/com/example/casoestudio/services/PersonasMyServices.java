package com.example.casoestudio.services;

import com.example.casoestudio.entity.PersonasMy;
import com.example.casoestudio.model.AuditoriaVehiculoMo;
import com.example.casoestudio.model.AuditoriasPersonasMo;
import com.example.casoestudio.repository.AuditoriasPersonasMoRepository;
import com.example.casoestudio.repository.PersonasMyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PersonasMyServices {

    @Autowired
    private PersonasMyRepository personasMyRepository;

    @Autowired
    private AuditoriasPersonasMoRepository auditoriasPersonasMoRepository;

    public List<PersonasMy> getPersonaMyAll(){
        return personasMyRepository.findAll();
    }

    public Optional<PersonasMy> getPersonaMyById(Long id){
        return personasMyRepository.findById(id);
    }

    public void saveOrUpdate(PersonasMy personasMy){

        personasMy = personasMyRepository.save(personasMy);

        AuditoriasPersonasMo auditoriasPersonasMo = new AuditoriasPersonasMo();
        auditoriasPersonasMo.setId(personasMy.getIdPersona().toString());
        auditoriasPersonasMo.setNombre(personasMy.getNombre().toString());
        auditoriasPersonasMo.setApellido(personasMy.getApellido().toString());
        auditoriasPersonasMo.setTipoDocumento(personasMy.getTipoDocumento().toString());
        auditoriasPersonasMo.setNumeroDocumento(personasMy.getNumeroDocumento().toString());
        auditoriasPersonasMo.setTelefono(personasMy.getTelefono().toString());
        auditoriasPersonasMoRepository.save(auditoriasPersonasMo);
    }
    public void deleteById(Long id){
        personasMyRepository.deleteById(id);
    }
}
