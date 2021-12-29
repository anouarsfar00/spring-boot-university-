package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.University;

public interface UniversiteRepository extends JpaRepository<University,Long> {

}
