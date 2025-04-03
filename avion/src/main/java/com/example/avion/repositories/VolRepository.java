package com.example.avion.repositories;

import com.example.avion.models.Vol.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolRepository extends JpaRepository<Vol, Integer> {
}
