package com.example.avion.models.Vol;

import com.example.avion.models.Ville.Ville;
import com.example.avion.models.Avion.Avion;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "vol")
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vol")
    private int id;

    @Column(name = "date_depart", nullable = false)
    private LocalDateTime dateDepart;

    @Column(name = "date_arrive", nullable = false)
    private LocalDateTime dateArrive;

    @Column(name = "prix_normale", nullable = false)
    private Double prixNormale;

    @ManyToOne
    @JoinColumn(name = "id_vol_depart", nullable = false)
    private Ville villeDepart;

    @ManyToOne
    @JoinColumn(name = "id_vol_arrivee", nullable = false)
    private Ville villeArrivee;

    @ManyToOne
    @JoinColumn(name = "id_avion", nullable = false)
    private Avion avion;

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDateTime dateDepart) {
        this.dateDepart = dateDepart;
    }

    public LocalDateTime getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(LocalDateTime dateArrive) {
        this.dateArrive = dateArrive;
    }

    public Double getPrixNormale() {
        return prixNormale;
    }

    public void setPrixNormale(Double prixNormale) {
        this.prixNormale = prixNormale;
    }

    public Ville getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(Ville villeDepart) {
        this.villeDepart = villeDepart;
    }

    public Ville getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(Ville villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
