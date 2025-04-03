package com.example.avion.models.Avion;

import jakarta.persistence.*;
import java.time.LocalDate;

import com.example.avion.models.Modele.Modele;

@Entity
@Table(name = "avion")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avion")
    private int id;

    @Column(name = "siege_business")
    private int siegeBusiness;

    @Column(name = "siege_eco")
    private int siegeEco;

    @Column(name = "date_fabrication")
    private LocalDate dateFabrication;

    @ManyToOne
    @JoinColumn(name = "id_modele", nullable = false)
    private Modele modele;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSiegeBusiness() {
        return siegeBusiness;
    }

    public void setSiegeBusiness(int siegeBusiness) {
        this.siegeBusiness = siegeBusiness;
    }

    public int getSiegeEco() {
        return siegeEco;
    }

    public void setSiegeEco(int siegeEco) {
        this.siegeEco = siegeEco;
    }

    public LocalDate getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(LocalDate dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }
}
