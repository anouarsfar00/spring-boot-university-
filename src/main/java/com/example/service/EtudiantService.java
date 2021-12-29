package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Etudiant;


public interface EtudiantService {
	void saveEtudiant (Etudiant e);
	void removeEtudiant(Long Id);
	void updateEtudiant(Etudiant e);
	 List<Etudiant>ListEtudiant();
	 Optional<Etudiant> findEtudiant(Long Id);
}
