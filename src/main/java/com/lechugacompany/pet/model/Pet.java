package com.lechugacompany.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Person owner;

    public Pet() {
    }

    public Pet(String name, String type, Person owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet [id=" + id + ", name=" + name + ", type=" + type + "]";
    }

}
