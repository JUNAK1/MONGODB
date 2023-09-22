package com.example.casoestudio.controller;

import com.example.casoestudio.model.AuditoriasPersonasMo;
import com.example.casoestudio.repository.AuditoriasPersonasMoRepository;
import com.example.casoestudio.resource.AuditoriasPersonasMoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuditoriaPersonasMoController {

    private AuditoriasPersonasMoRepository auditoriasPersonasMoRepository;

    public AuditoriaPersonasMoController(AuditoriasPersonasMoRepository auditoriasPersonasMoRepository) {
        this.auditoriasPersonasMoRepository = auditoriasPersonasMoRepository;
    }

    //---------------------------------------------------------------------------------------------------
    @GetMapping("/auditpersona")
    public ResponseEntity<List<AuditoriasPersonasMo>> getAllAudits(){
        return ResponseEntity.ok(this.auditoriasPersonasMoRepository.findAll());
    }
    //---------------------------------------------------------------------------------------------------
    @PostMapping("/auditpersona")
    public ResponseEntity<AuditoriasPersonasMo> createAudit(@RequestBody AuditoriasPersonasMoRequest auditoriasPersonasMoRequest){
        AuditoriasPersonasMo audiPersona = new AuditoriasPersonasMo();
        audiPersona.setOperacion(auditoriasPersonasMoRequest.getOperacion());
        audiPersona.setFecha(auditoriasPersonasMoRequest.getFecha());
        audiPersona.setIdPersona(auditoriasPersonasMoRequest.getIdPersona());
        audiPersona.setNombre(auditoriasPersonasMoRequest.getNombre());
        audiPersona.setApellido(auditoriasPersonasMoRequest.getApellido());
        audiPersona.setFechaNacimiento(auditoriasPersonasMoRequest.getFechaNacimiento());
        audiPersona.setTipoDocumento(auditoriasPersonasMoRequest.getTipoDocumento());
        audiPersona.setNumeroDocumento(auditoriasPersonasMoRequest.getNumeroDocumento());
        audiPersona.setDireccion(auditoriasPersonasMoRequest.getDireccion());
        audiPersona.setTelefono(auditoriasPersonasMoRequest.getTelefono());
        audiPersona.setFechaPersona(auditoriasPersonasMoRequest.getFechaPersona());
        return ResponseEntity.status(201).body(this.auditoriasPersonasMoRepository.save(audiPersona));
    }
    //---------------------------------------------------------------------------------------------------
    @GetMapping("/auditpersona/{id}")
    public ResponseEntity getAllAudiPersonaById(@PathVariable String id){

        Optional<AuditoriasPersonasMo> auditoriasPersonasMo = this.auditoriasPersonasMoRepository.findById(id);

        if(auditoriasPersonasMo.isPresent()){
            return ResponseEntity.ok(auditoriasPersonasMo.get());
        }else {
            return ResponseEntity.ok("The product with id: " + id + " was not found. ");
        }
    }
    //---------------------------------------------------------------------------------------------------
    @DeleteMapping("/audit/delete/{id}")
    public ResponseEntity deleteAudiPersonasById(@PathVariable String id){

        Optional<AuditoriasPersonasMo> auditoriasPersonasMo = this.auditoriasPersonasMoRepository.findById(id);

        if(auditoriasPersonasMo.isPresent()){
            this.auditoriasPersonasMoRepository.deleteById(id);
            return ResponseEntity.ok("Success.");
        }else{
            return ResponseEntity.ok("The product with id: " + id + " was not found. ");
        }
    }

}
