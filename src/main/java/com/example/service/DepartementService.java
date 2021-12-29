package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Departement;


public interface DepartementService {
	Departement saveDepartement (Departement Dep);
	Departement removeDepartement(Long Id);
	Departement updateDepartement(Departement Dep);
	List<Departement>ListDepartement();
	Optional<Departement> findDepartement(Long Id); 
}
