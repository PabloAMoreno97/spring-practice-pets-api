package com.lechugacompany.pet.model;


public class PetRequest {

    private String name;
    private String type;
    private Long ownerId;

    public PetRequest(){
        
    }

    public PetRequest(String name, String type, Long ownerId) {
        this.name = name;
        this.type = type;
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "PetRequest [name=" + name + ", type=" + type + ", ownerId=" + ownerId + "]";
    }

}
