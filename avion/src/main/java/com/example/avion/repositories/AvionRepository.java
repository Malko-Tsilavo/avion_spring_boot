package com.example.avion.repositories;

import com.example.avion.models.Avion.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends JpaRepository<Avion, Integer> {
}
