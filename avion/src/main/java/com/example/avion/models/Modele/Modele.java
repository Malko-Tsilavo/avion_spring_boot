package com.example.avion.models.Modele;

import jakarta.persistence.*;

@Entity
@Table(name = "modele")
public class Modele {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modele")
    private int id;

    @Column(nullable = false)
    private String nom;

    @Column(name = "date_creation")
    private String dateCreation;

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

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }
}
