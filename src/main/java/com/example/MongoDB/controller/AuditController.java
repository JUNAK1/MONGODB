package com.example.MongoDB.controller;

import com.example.MongoDB.model.Audit;
import com.example.MongoDB.repository.AuditRepository;
import com.example.MongoDB.resource.AuditRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuditController {

    private AuditRepository auditRepository;

    public AuditController(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }

    @GetMapping("/audit")
    public ResponseEntity<List<Audit>> getAllAudits(){
        return ResponseEntity.ok(this.auditRepository.findAll());
    }

    @PostMapping("/audit")
    public ResponseEntity<Audit> createAudit(@RequestBody AuditRequest auditRequest){
        Audit audit = new Audit();
        audit.setName(auditRequest.getName());
        audit.setDescription(auditRequest.getDescription());
        return ResponseEntity.status(201).body(this.auditRepository.save(audit));
    }

    @GetMapping("/audit/{id}")
    public ResponseEntity getAllAuditById(@PathVariable String id){

        Optional<Audit> audit = this.auditRepository.findById(id);

        if(audit.isPresent()){
            return ResponseEntity.ok(audit.get());
        }else {
            return ResponseEntity.ok("The product with id: " + id + " was not found. ");
        }
    }

    @DeleteMapping("/audit/delete/{id}")
    public ResponseEntity deleteAuditById(@PathVariable String id){

        Optional<Audit> audit = this.auditRepository.findById(id);

        if(audit.isPresent()){
            this.auditRepository.deleteById(id);
            return ResponseEntity.ok("Success.");
        }else{
            return ResponseEntity.ok("The product with id: " + id + " was not found. ");
        }
    }
}
