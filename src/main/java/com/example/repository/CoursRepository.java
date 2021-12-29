package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {

}
