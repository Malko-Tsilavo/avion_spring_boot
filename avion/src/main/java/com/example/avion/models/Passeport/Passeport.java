package com.example.avion.models.Passeport;

import com.example.avion.models.Reservation.Reservation;  // Ajoute cette ligne si ce n'est pas déjà fait

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "passeport")
public class Passeport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_passeport")
    private int id;

    @Column(name = "source_path", nullable = false)
    private String sourcePath;

    @ManyToOne
    @JoinColumn(name = "id_reservation", nullable = false)
    private Reservation reservation;

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }
}
