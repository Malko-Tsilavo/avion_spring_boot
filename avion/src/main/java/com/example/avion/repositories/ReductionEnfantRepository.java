package com.example.avion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.avion.models.PromtionEnfant.ReductionEnfant;


@Repository
public interface ReductionEnfantRepository extends JpaRepository<ReductionEnfant, Long> {
}
