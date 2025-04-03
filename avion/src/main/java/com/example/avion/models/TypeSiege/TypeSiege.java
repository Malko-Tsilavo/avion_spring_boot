package com.example.avion.models.TypeSiege;

import jakarta.persistence.*;

@Entity
@Table(name = "type_siege")
public class TypeSiege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    private int id;

    @Column(nullable = false)
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
