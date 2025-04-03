package com.example.avion.repositories;

import com.example.avion.models.Modele.Modele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeleRepository extends JpaRepository<Modele, Integer> {
}
