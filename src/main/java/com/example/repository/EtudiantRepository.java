package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
