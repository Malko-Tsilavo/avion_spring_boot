package com.example.avion.models.Reservation;

import com.example.avion.models.TypeSiege.TypeSiege;
import com.example.avion.models.Utilisateur.Utilisateur;
import com.example.avion.models.Vol.Vol;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private int id;

    @Column(name = "date_reservation", nullable = false)
    private LocalDateTime dateReservation;

    @Column(name = "etat_reservation", nullable = false)
    private String etatReservation;

    @Column(name = "place_adulte", nullable = false)
    private int placeAdulte;

    @Column(name = "place_enfant", nullable = false)
    private int placeEnfant;

    @Column(name = "prix_totale", nullable = false)
    private Double prixTotale;

    @ManyToOne
    @JoinColumn(name = "id_type", nullable = false)
    private TypeSiege typeSiege;

    @ManyToOne
    @JoinColumn(name = "id_vol", nullable = false)
    private Vol vol;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private Utilisateur utilisateur;

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getEtatReservation() {
        return etatReservation;
    }

    public void setEtatReservation(String etatReservation) {
        this.etatReservation = etatReservation;
    }

    public int getPlaceAdulte() {
        return placeAdulte;
    }

    public void setPlaceAdulte(int placeAdulte) {
        this.placeAdulte = placeAdulte;
    }

    public int getPlaceEnfant() {
        return placeEnfant;
    }

    public void setPlaceEnfant(int placeEnfant) {
        this.placeEnfant = placeEnfant;
    }

    public Double getPrixTotale() {
        return prixTotale;
    }

    public void setPrixTotale(Double prixTotale) {
        this.prixTotale = prixTotale;
    }

    public TypeSiege getTypeSiege() {
        return typeSiege;
    }

    public void setTypeSiege(TypeSiege typeSiege) {
        this.typeSiege = typeSiege;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
