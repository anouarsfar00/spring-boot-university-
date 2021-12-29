package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Enseignant;


public interface EnseignantService {
	void saveEnseignant (Enseignant ens);
	void removeEnseignant(Long Id);
	void updateEnseignant(Enseignant ens);
	 List<Enseignant>ListEnseignant();
	 Optional<Enseignant> findEnseignant(Long Id);
}
