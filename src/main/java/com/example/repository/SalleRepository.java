package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Salle;

public interface SalleRepository extends JpaRepository<Salle,Long> {

}
