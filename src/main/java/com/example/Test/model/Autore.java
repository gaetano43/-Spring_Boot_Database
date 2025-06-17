package com.example.Test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Autore {
    @Id
    private String nome;
    private Integer id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
