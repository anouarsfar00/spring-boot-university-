package com.example.serviceimp;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.Enseignant;
import com.example.repository.EnseignantRepository;
import com.example.service.EnseignantService;
@Service
@Transactional
@Component
public class EnseignantImp implements EnseignantService {
	@Autowired
	EnseignantRepository enseignantRepository;
	
	@Override
	public void saveEnseignant (Enseignant ens) {
		enseignantRepository.save(ens);
	}
	
	@Override
	public void removeEnseignant(Long Id){
		enseignantRepository.deleteById(Id);
	} 
	@Override
	public void updateEnseignant(Enseignant ens) {
		enseignantRepository.save(ens);
	}
	
	@Override
	public List<Enseignant>ListEnseignant(){
		return enseignantRepository.findAll();
	}
	@Override
	public Optional<Enseignant> findEnseignant(Long Id) {
		return enseignantRepository.findById(Id);
	}

}