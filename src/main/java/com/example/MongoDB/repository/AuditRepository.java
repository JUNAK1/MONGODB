package com.example.MongoDB.repository;

import com.example.MongoDB.model.Audit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditRepository extends MongoRepository<Audit,String> {

}
