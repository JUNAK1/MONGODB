package com.example.casoestudio.controller;

import com.example.casoestudio.model.AuditoriaVehiculoMo;
import com.example.casoestudio.model.AuditoriasPersonasMo;
import com.example.casoestudio.repository.AuditoriaVehiculoMoRepository;
import com.example.casoestudio.resource.AuditoriasVehiculoMoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuditoriaVehiculoMoController {

    private AuditoriaVehiculoMoRepository auditoriaVehiculoMoRepository;

    public AuditoriaVehiculoMoController(AuditoriaVehiculoMoRepository auditoriaVehiculoMoRepository) {
        this.auditoriaVehiculoMoRepository = auditoriaVehiculoMoRepository;
    }

    //---------------------------------------------------------------------------------------------------
    @GetMapping("/auditveiculo")
    public ResponseEntity<List<AuditoriaVehiculoMo>> getAllAuditsVeiculo(){
        return ResponseEntity.ok(this.auditoriaVehiculoMoRepository.findAll());
    }

    //---------------------------------------------------------------------------------------------------
    @PostMapping("/auditveiculo")
    public ResponseEntity<AuditoriaVehiculoMo> createAudit(@RequestBody AuditoriasVehiculoMoRequest auditoriasVehiculoMoRequest){
        AuditoriaVehiculoMo audiVehic = new AuditoriaVehiculoMo();
        audiVehic.setOperacion(auditoriasVehiculoMoRequest.getOperacion());
        audiVehic.setFecha(auditoriasVehiculoMoRequest.getFecha());
        audiVehic.setIdVehiculos(auditoriasVehiculoMoRequest.getIdVehiculos());
        audiVehic.setMarca(auditoriasVehiculoMoRequest.getMarca());
        audiVehic.setModelo(auditoriasVehiculoMoRequest.getModelo());
        audiVehic.setCilindrada(auditoriasVehiculoMoRequest.getCilindrada());
        audiVehic.setPrecio(auditoriasVehiculoMoRequest.getPrecio());
        audiVehic.setMatricula(auditoriasVehiculoMoRequest.getMatricula());
        audiVehic.setUsado(auditoriasVehiculoMoRequest.getUsado());
        audiVehic.setIdModelo(auditoriasVehiculoMoRequest.getIdModelo());
        return ResponseEntity.status(201).body(this.auditoriaVehiculoMoRepository.save(audiVehic));
    }
    //---------------------------------------------------------------------------------------------------
    @GetMapping("/auditvehiculo/{id}")
    public ResponseEntity getAllAudiVehiculoById(@PathVariable String id){

        Optional<AuditoriaVehiculoMo> auditoriaVehiculoMo = this.auditoriaVehiculoMoRepository.findById(id);

        if(auditoriaVehiculoMo.isPresent()){
            return ResponseEntity.ok(auditoriaVehiculoMo.get());
        }else {
            return ResponseEntity.ok("The product with id: " + id + " was not found. ");
        }
    }
    //---------------------------------------------------------------------------------------------------
    @DeleteMapping("/audit/deleteveiculo/{id}")
    public ResponseEntity deleteAudiVehiculoById(@PathVariable String id){

        Optional<AuditoriaVehiculoMo> auditoriaVehiculoMo = this.auditoriaVehiculoMoRepository.findById(id);

        if(auditoriaVehiculoMo.isPresent()){
            this.auditoriaVehiculoMoRepository.deleteById(id);
            return ResponseEntity.ok("Success.");
        }else{
            return ResponseEntity.ok("The product with id: " + id + " was not found. ");
        }
    }


}
