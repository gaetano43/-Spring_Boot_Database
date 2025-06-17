package com.example.Test.model;

import jakarta.persistence.*;

@Entity
public class Messaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement
    private Integer id;

    private String testo;

    // Getter e Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
}
