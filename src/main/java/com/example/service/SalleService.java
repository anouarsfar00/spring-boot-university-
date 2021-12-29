package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Salle;


public interface SalleService {
	void saveSalle (Salle sal);
	void removeSalle(Long Id);
	void updateSalle(Salle Dep);
	 List<Salle>ListSalle();
	 Optional<Salle> findSalle(Long Id);
}
