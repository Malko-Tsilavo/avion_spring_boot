package com.example.avion.repositories;

import com.example.avion.models.TypeSiege.TypeSiege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeSiegeRepository extends JpaRepository<TypeSiege, Integer> {
}
