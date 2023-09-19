package com.example.MongoDB.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuditRequest {

    private String name;
    private String description;

    public AuditRequest() {
    }

    public AuditRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
