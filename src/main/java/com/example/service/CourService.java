package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Cours;


public interface CourService {
	 void saveCours( Cours c);
	 void updateCours( Cours c);
	 List <Cours> ListCours();
	 void removeCours(Long Id);
	 Optional<Cours> findCours(Long Id);
}
