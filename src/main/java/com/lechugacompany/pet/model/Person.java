package com.lechugacompany.pet.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    private Integer document;
    private String name;
    private String lastname;
    private String email;
    private LocalDate birth;

    public Person() {

    }

    public Person(Integer document, String name, String lastname, String email, LocalDate birth) {
        this.document = document;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.birth = birth;
    }

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person [document=" + document + ", name=" + name + ", lastname=" + lastname + "]";
    }

}
