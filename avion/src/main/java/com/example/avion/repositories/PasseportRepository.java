package com.example.avion.repositories;

import com.example.avion.models.Passeport.Passeport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasseportRepository extends JpaRepository<Passeport, Integer> {
}
