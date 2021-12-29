package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Long> {

}
